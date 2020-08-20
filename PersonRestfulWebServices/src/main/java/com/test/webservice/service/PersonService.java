package com.test.webservice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import com.test.webservice.bean.Person;


public class PersonService {

	 static HashMap<Integer,Person> PersonIdMap=getPersonIdMap();


	 public PersonService() {
	  super();

	  if(PersonIdMap==null)
	  {
	   PersonIdMap=new HashMap<Integer,Person>();
	  // Creating some objects of Person while initializing
	   
	  /* List<Address> address = new ArrayList<Address>();
	   
	   address.add(new Address(1, "Manikonda", "HYD", "TS", 500089));
	   address.add(new Address(2, "sec", "HYD", "TS", 500089));
	   */
	   
	  
	   Person shyam=new Person(1, "madas","shyam","NZB");
	   Person ram=new Person(2, "abc","ram","HYD");
	   Person raju=new Person(3, "raju","sss","SEC");
	   Person xyz=new Person(4, "xyz","www","MUM");
	   Person abc=new Person(5, "abc","eee","CHN");
	 

	   PersonIdMap.put(1,shyam);
	   PersonIdMap.put(4,xyz);
	   PersonIdMap.put(3,raju);
	   PersonIdMap.put(2,ram);
	   PersonIdMap.put(5,abc);
	  }
	 }

	 public List<Person> getAllPersons()
	 {
	  List<Person> persons = new ArrayList<Person>(PersonIdMap.values());
	  return persons;
	 }

	 public Person getPerson(int id)
	 {
	  Person Person= PersonIdMap.get(id);
	  return Person;
	 }
	 
	 public Person addPerson(Person Person)
	 {
	  Person.setId(getMaxId()+1);
	  PersonIdMap.put(Person.getId(), Person);
	  return Person;
	 }
	
	 public Person updatePerson(Person Person)
	 {
	  if(Person.getId()<=0)
	   return null;
	  PersonIdMap.put(Person.getId(), Person);
	  return Person;

	 }
	
	 public void deletePerson(int id)
	 {
	  PersonIdMap.remove(id);
	 }

	 public static HashMap<Integer, Person> getPersonIdMap() {
	  return PersonIdMap;
	 }
	 

	 // Utility method to get max id
	 public static int getMaxId()
	 {   int max=0;
	 for (int id:PersonIdMap.keySet()) {  
	  if(max<=id)
	   max=id;

	 }  
	 return max;
	 }
}
