package com.homework.web.service;

import com.homework.web.pojo.User;
import com.homework.web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public User selectByUsername(String username) {
		return userRepository.selectByUsername(username);
	}

	public User insert(User user) {
		return userRepository.save(user);
	}

	public User update(User user) {
		return userRepository.save(user);
	}

	public User selectById(Integer id) {
		return userRepository.findById(id).get();
	}

	public List<User> selectByFollowing_id(Integer following_id) {
		return userRepository.selectByFollowing_id(following_id);
	}

	public List<User> selectByFollower_id(Integer follower_id) {
		return userRepository.selectByFollower_id(follower_id);
	}

}
