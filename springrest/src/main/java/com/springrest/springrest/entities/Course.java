package com.springrest.springrest.entities;

import java.time.LocalTime;
import java.util.Date;

public class Course {
  private long id;
  private String title;
  private  String description;
  
  private Date date;
  
  public void setDate(Date date) {
    this.date = date;
  }
  
  public Date getDate() {
    return date;
  }
  
  public Course(long id, String title, String description) {
    this.id = id;
    this.title = title;
    this.description = description;
  }
  
  public Course() {
    super();
  }
  
  public void setId(long id) {
    this.id = id;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public long getId() {
    return id;
  }
  
  public String getTitle() {
    return title;
  }
  
  public String getDescription() {
    return description;
  }
  
 
}
