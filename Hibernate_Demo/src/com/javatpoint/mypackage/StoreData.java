package com.javatpoint.mypackage;  
  
import java.util.List;
import java.util.ListIterator;

import org.hibernate.Query;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


  
public class StoreData {  
public static void main(String[] args) {  
      
    //creating configuration object  
    Configuration cfg=new Configuration();  
    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
      
    //creating seession factory object  
    SessionFactory factory=cfg.buildSessionFactory();  
      
    //creating session object  
    Session session=factory.openSession();  
      
    //creating transaction object  
    Transaction t=session.beginTransaction();  
          
    Employee e1=new Employee();  
    e1.setId(117);  
    e1.setFirstName("Zsolt2");  
    e1.setLastName("Lakatos2");  
    //session.persist(e1);
    Query q=session.createQuery("from Employee where LastName=:Name");
    q.setParameter("Name", "Lakatos");
    List l=q.list();
    ListIterator iteral=l.listIterator();
    
    while (iteral.hasNext()){
    	
    	Employee e=(Employee)iteral.next();
    	System.out.print(e.getFirstName()+e.getLastName());
    }
   
    Employee emp=(Employee) session.get(Employee.class, 116);
    System.out.print(emp.getFirstName()+emp.getLastName());
      
    List ems=session.createCriteria(Employee.class).add(Restrictions.like("firstName", "%s%")).list();
    iteral=ems.listIterator();
	    
	while (iteral.hasNext()){
	    	
	    	Employee e=(Employee)iteral.next();
	    	System.out.print(e.getFirstName()+e.getLastName());
	    }
    
    
    t.commit();//transaction is committed  

    session.close();  

      
}  
}  