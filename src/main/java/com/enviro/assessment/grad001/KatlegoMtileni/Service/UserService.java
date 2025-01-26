package com.enviro.assessment.grad001.KatlegoMtileni.Service;

import org.springframework.stereotype.Service;

import com.enviro.assessment.grad001.KatlegoMtileni.Repository.GenericRepository;
import com.enviro.assessment.grad001.KatlegoMtileni.Repository.UserRepository;
import com.enviro.assessment.grad001.KatlegoMtileni.model.User;

@Service
public class UserService extends GenericService<User, Integer> {

	//Passes the an object of UserRepository to to GenericServices to communicate with database from the User table
	public UserService(UserRepository repository) {
		super(repository);
	}

}
