package com.example.ujianspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ujianspringboot.entity.User;
import com.example.ujianspringboot.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public User addUser (@RequestBody User user) {
		return userService.saveUser(user);
	}
	@PostMapping("/addUsers")
	public List<User> addUsers(@RequestBody List<User> users){
		return userService.saveUsers(users);
	}
	@GetMapping ("/getUserById/{user_id}")
	public User findByID (@PathVariable int user_id) {
		return userService.getUserById(user_id);
	}
//	@GetMapping("/getUserByName/{user_name}")
//	public User findByName(@PathVariable String user_name) {
//		return userService.getUserByName(user_name);
//	}
}
