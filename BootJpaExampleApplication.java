package com.jpa.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.Entities.User;
import com.jpa.test.dao.UserRepository;

@SpringBootApplication
public class BootJpaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootJpaExampleApplication.class, args);
		
		UserRepository userRepository=context.getBean(UserRepository.class);
		
		User user1=new User();
		user1.setName("Avijit");
		user1.setCity("Delhi");
		user1.setStatus("Java Developer");
		
		//IT IS ONLY FOR SINGLE USER
		
//	    User user=userRepository.save(user1);
//	    
//	    System.out.println(user);
//	    System.out.println("Data Inserted Succesfully");
		
		User user2=new User();
		user2.setName("Runu");
		user2.setCity("Odisha");
		user2.setStatus("School Teacher");
		
		//IT IS ONLY FOR MULTIPLE USER ..........................
		
//		List<User> users=List.of(user1,user2);
//		Iterable<User> result=userRepository.saveAll(users);
//		
//		result.forEach(user->{
//			System.out.println(user);
//		});
//		
//		System.out.println("Done");
		
		//FIND A USER AND UPDATE...............................
		
//		Optional<User> optional=userRepository.findById(503);
//		User user=optional.get();
//		
//		user.setStatus("Tution Teacher");
//		User result=userRepository.save(user);
//		System.out.println(result);
	
		//FIND MULTIPLE USER DETAILS................
		
//		Iterable<User> itr=userRepository.findAll();
//		itr.forEach(user->{
//			System.out.println(user);
//		});
		  
		//DELETING SINGLE USER DETAILS
//		userRepository.deleteById(503);
//		
//		System.out.println("Deleted......");
		
		//MULTIPLE USER DELETE.....................
		
//		Iterable<User>  allusers=userRepository.findAll();
//		
//		allusers.forEach(user->{
//		System.out.println(user);
//		});
//		
//		userRepository.deleteAll(allusers);
		
	}

}
