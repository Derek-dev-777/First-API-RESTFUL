package aPI.REST.Application.Service;

import aPI.REST.Application.Models.User;

public interface UserService {
	
	
	User findById(Long id);
	
	User create(User userToCreate);
}
