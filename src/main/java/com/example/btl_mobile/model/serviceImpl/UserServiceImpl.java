package com.example.btl_mobile.model.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.btl_mobile.model.entity.User;
import com.example.btl_mobile.model.service.UserService;
import com.example.btl_mobile.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User updateUser(int id, User user) {
		// TODO Auto-generated method stub
		user.setId(id);
		return userRepository.save(user);
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
		return true;
	}
	
}
