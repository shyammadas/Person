package junit;
import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.test.webservice.bean.Person;
import com.test.webservice.service.PersonService;

import io.restassured.RestAssured;
 
public class PersonRestTest {
    @BeforeClass
    public static void init() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
    }
 
    @Test
    public void testUserFetchesSuccess() {
        get("/PersonRestfulWebServices/person/1")
        .then()
        .body("id", equalTo(1))
        .body("firstname", equalTo("madas"))
        .body("lastname", equalTo("shyam"))
        .body("address", equalTo("NZB"));
    }
    
    @Test
    public void testUserAddSuccess() {
    	PersonService pService = new PersonService();
      Person person = new Person();
      person.setFirstname("aaa");
      person.setLastname("bbb");
      person.setAddress("ssssss");
      
      Person p1= pService.addPerson(person);
      
      Assert.assertNotNull(p1);
      
      
      
    }
}