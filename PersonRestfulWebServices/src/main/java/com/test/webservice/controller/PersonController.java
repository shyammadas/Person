package com.test.webservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.webservice.bean.Person;
import com.test.webservice.service.PersonService;

@RestController
public class PersonController {

	PersonService personService = new PersonService();

	@RequestMapping(value = "/persons", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Person> getPersons() {
		List<Person> listOfpersons = personService.getAllPersons();
		return listOfpersons;
	}

	@RequestMapping(value = "/person/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Person getPersonById(@PathVariable int id) {
		return personService.getPerson(id);
	}

	@RequestMapping(value = "/persons", method = RequestMethod.POST, headers = "Accept=application/json")
	public Person addPerson(@RequestBody Person person) {
		return personService.addPerson(person);
	}
	
	@RequestMapping(value = "/persons", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Person updatePerson(@RequestBody Person person) {
		return personService.updatePerson(person);

	}
	
	@RequestMapping(value = "/person/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deletePerson(@PathVariable("id") int id) {
		personService.deletePerson(id);

	}	
}
