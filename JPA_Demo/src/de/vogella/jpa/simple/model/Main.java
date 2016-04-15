package de.vogella.jpa.simple.model;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;


public class Main {
  private static final String PERSISTENCE_UNIT_NAME = "todos";
  private static EntityManagerFactory factory;

  public static void main(String[] args) {
    factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    EntityManager em = factory.createEntityManager();
    // read the existing entries and write to console
    Query q = em.createQuery("select t from Todo t where t.summary=:param ");
    q.setParameter("param", "1");
    List<Todo> todoList = q.getResultList();
    
    Query q2 = em.createNativeQuery("select * from Todo t where t.summary=? ");
    q2.setParameter(1, "1");
    List<Todo> todoList2 = q2.getResultList();
    
    CriteriaQuery cq1=em.getCriteriaBuilder().createQuery();
    cq1.select(cq1.from(Todo.class));
    List<Todo> todoList3=em.createQuery(cq1).getResultList();
    
    for (Todo todo : todoList) {
      System.out.println(todo);
    }
    System.out.println("Size: " + todoList.size());

    // create new todo
    em.getTransaction().begin();
    Todo todo = new Todo();
    todo.setSummary("This is a test1");
    todo.setDescription("This is a test1");
    em.persist(todo);
    em.getTransaction().commit();

    em.close();
  }
} 