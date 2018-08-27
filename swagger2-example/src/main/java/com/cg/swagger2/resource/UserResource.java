package com.cg.swagger2.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pojo.User;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

	@GetMapping
	public List<User> getUsers(){
		return Arrays.asList(
	          new User("Pooja",42000),
	          new User("Shraddha",32000),
	          new User("Sneha",19000),
	          new User("Meera",50000)
	          );
	}
	
	@GetMapping("/{userName}")
	public User getUser(@PathVariable("userName") final String userName) {
		return new User(userName, 1000);
	}
}
