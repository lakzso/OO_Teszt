package de.vogella.jpa.simple.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="findAll", query="select t from Todo t") 
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  private Long id;
  private String summary;
  private String description;

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Todo [summary=" + summary + ", description=" + description
        + "]";
  }

} 
