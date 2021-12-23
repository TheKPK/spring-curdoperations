package com.jpa.test;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootjpaexampleApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

        UserRepository userRepository = context.getBean(UserRepository.class);
//
//        User user = new User();
//        user.setName("Pratibha Kumar K");
//        user.setCity("Hyderabad");
//        user.setStatus("I am javaScript programmer");
//
////
//        User user2 = new User();
//        user2.setName("Kumar");
//        user2.setCity("Banglore");
//        user2.setStatus("Java Programmer");

//		User savedUserDetails = userRepository.save(user2);
//		System.out.println(savedUserDetails);


//        List<User> allUsers = List.of(user, user2);
//        Iterable<User> result = userRepository.saveAll(allUsers);
//
//        result.forEach(u -> {
//            System.out.println(u);
//        });
//
//        System.out.println("done");

//		 update the user of id 4
//        Optional<User> optional = userRepository.findById(4);
//        User userId = optional.get();
//        System.out.println(userId);
//
//        userId.setName("Ramesh Kumar");
//        User changedUser = userRepository.save(userId);
//        System.out.println(changedUser);


        System.out.println("***before delete***");
        Iterable<User> itr = userRepository.findAll();
        itr.forEach(user -> System.out.println(user));
//         Deleting the user element
//        userRepository.deleteById(4);
        System.out.println("deleted");

        System.out.println("***after delete***");

        Iterable<User> itr2 = userRepository.findAll();
        itr2.forEach(user1 -> System.out.println(user1));
//		Iterable<User> allusers = userRepository.findAll();
//		
//		allusers.forEach(user->System.out.println(user));
//		
//		userRepository.deleteAll(allusers);
//		
//		List<User> users = userRepository.findByNameAndCity("Durgesh", "Kanpur");
//		
//		users.forEach(e->System.out.println(e));

//		List<User> allUser = userRepository.getAllUser();
//		
//		allUser.forEach(e->{
//			System.out.println(e);
//		});
//		System.out.println("______________________________________");
//		
//		List<User> userByName = userRepository.getUserByName("Karan","delhi");
//		userByName.forEach(e->{
//			System.out.println(e);
//		});
//		
//		System.out.println("______________________________________");
//		userRepository.getUsers().forEach(e->System.out.println(e));
//		

    }

}
