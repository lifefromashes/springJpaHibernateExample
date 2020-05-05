package com.techprimers.jpa.springjpahibernateexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprimers.jpa.springjpahibernateexample.model.UsersContact;

public interface UsersContactRepository extends JpaRepository<UsersContact, Integer> {
	

}
