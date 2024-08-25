package com.deploy.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deploy.user.entity.User;
import com.deploy.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public Optional<User> getUserById(String id) {
		return userRepository.findById(id);
	}

	public User createUser(User user) {
		return userRepository.save(user);
	}

	public void deleteUser(String id) {
		userRepository.deleteById(id);
	}

	public User updateUser(String id, User user) {
		if (userRepository.existsById(id)) {
			user.setId(id);
			return userRepository.save(user);
		}
		return null;
	}
}
