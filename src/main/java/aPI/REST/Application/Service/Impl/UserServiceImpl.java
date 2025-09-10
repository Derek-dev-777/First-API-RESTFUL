package aPI.REST.Application.Service.Impl;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aPI.REST.Application.Models.User;
import aPI.REST.Application.Repository.UserRepository;
import aPI.REST.Application.Service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User userToCreate) {
		if (userToCreate.getId() != null && userRepository.equals(userToCreate.getId())) {
			throw new IllegalArgumentException("This user ID already exists");
		}
		return userRepository.save(userToCreate);
	}
	
	
}
