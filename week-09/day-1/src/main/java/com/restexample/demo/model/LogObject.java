package com.restexample.demo.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class LogObject {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  private Date createdAt;
  private String endpoint;
  private String data;

  public LogObject(String endpoint, String data){
    this.createdAt = createdAt;
    this.endpoint = endpoint;
    this.data = data;
  }

  public LogObject(){}

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
