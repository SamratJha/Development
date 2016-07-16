package com.example;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class SpringBootNoSqlApplication implements CommandLineRunner{

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public void run(String... strings) throws Exception {
		customerRepository.deleteAll();

		//Save a couple
		customerRepository.save(new Customer("Popo", "Jha"));
		customerRepository.save(new Customer("Potti", "Jha"));

		customerRepository.findAll().stream()
				.forEach(System.out::println);

		System.out.println("By First Name::"+customerRepository.findByFirstName("Samrat"));
		System.out.println("By Last Name::"+customerRepository.findByLastName("Jha"));
		mongoTemplate.dropCollection("Customer_Info");
		DBCollection customer_info = mongoTemplate.createCollection("Customer_Info");
		DBObject object =  new BasicDBObject();
		object.put("Name","Samrat Jha");
		object.put("Age",32);
		customer_info.save(object);
		DBObject object1 =  new BasicDBObject();
		object1.put("FirstName","Sreyasree");
		object1.put("LastName","Jha");
		object1.put("Age",29);
		customer_info.save(object1);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNoSqlApplication.class, args);
	}
}
