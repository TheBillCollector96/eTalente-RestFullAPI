package com.enviro.assessment.grad001.KatlegoMtileni.Service;

import org.springframework.stereotype.Service;

import com.enviro.assessment.grad001.KatlegoMtileni.Repository.ContextRepository;
import com.enviro.assessment.grad001.KatlegoMtileni.Repository.GenericRepository;
import com.enviro.assessment.grad001.KatlegoMtileni.model.Context;

@Service
public class ContextService extends GenericService<Context, Integer> {

	//Passes the an object of ContextRepository to to GenericServices to communicate with database generically
	public ContextService(ContextRepository repository) {
		super(repository);
	}

}
