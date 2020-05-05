package com.techprimers.jpa.springjpahibernateexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users_log", catalog = "test")
public class UsersLog {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "log_id")//primary key
	private Integer id;

	private String log;
	
	@Column(name = "user_id") //foreign key to link to users table
	private Integer userId;

	public UsersLog() {
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

}
