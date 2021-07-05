package com.example.ujianspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ujianspringboot.entity.User;
import com.example.ujianspringboot.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	public List<User> saveUsers(List<User> users) {
		// TODO Auto-generated method stub
		return userRepository.saveAll(users);
	}

	public User getUserById(int user_id) {
		// TODO Auto-generated method stub
		return userRepository.findById(user_id).orElse(null);
	}

//	public User getUserByName(String user_name) {
//		// TODO Auto-generated method stub
//		return userRepository.findByName(user_name);
//	}

}
