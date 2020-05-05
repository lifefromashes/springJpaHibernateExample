package com.techprimers.jpa.springjpahibernateexample.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.jpa.springjpahibernateexample.model.Users;
import com.techprimers.jpa.springjpahibernateexample.model.UsersContact;
import com.techprimers.jpa.springjpahibernateexample.model.UsersLog;
import com.techprimers.jpa.springjpahibernateexample.repository.UsersContactRepository;

@RequestMapping("/rest/userscontact")
@RestController
public class UsersContactResource {

	private UsersContactRepository usersContactRepository;

	@Autowired // dont really need for newest spring bc it does constructor injection
	public UsersContactResource(UsersContactRepository usersContactRepository) {

		this.usersContactRepository = usersContactRepository;
	}

	@GetMapping(value = "/all")
	public List<UsersContact> getUsersContact() {
		return usersContactRepository.findAll();
	}

	@GetMapping(value = "/update/{name}")
	public List<UsersContact> update(@PathVariable final String name) {
		UsersContact usersContact = new UsersContact();

		Users users = new Users();
		
		UsersLog usersLog1 = new UsersLog();
		usersLog1.setLog("Hi YouTube");
		
		UsersLog usersLog2 = new UsersLog();
		usersLog2.setLog("Hi Viewers");

		users.setTeamName("Development").setSalary(10000).setName(name).setUsersLogs(Arrays.asList(usersLog1, usersLog2));
		;

		usersContact.setPhonenum(111111).setUsers(users);

		usersContactRepository.save(usersContact);

		return usersContactRepository.findAll();
	}

}
