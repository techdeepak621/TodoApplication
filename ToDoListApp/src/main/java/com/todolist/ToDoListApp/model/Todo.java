package com.todolist.ToDoListApp.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author deepak.mohapatra
 *
 */
@Entity
@Table(name = "Todos")
public class Todo {

	@Id
	@GeneratedValue
	private long id;
	@Column(name = "title")
	private String title;
	@Column(name = "completed")
	private Boolean completed;
	@Column(name = "createdAt")
	private Date createdAt = new Date();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
