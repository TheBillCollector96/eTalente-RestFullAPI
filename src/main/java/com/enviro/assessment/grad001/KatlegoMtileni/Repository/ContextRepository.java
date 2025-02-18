package com.enviro.assessment.grad001.KatlegoMtileni.Repository;

import org.springframework.stereotype.Repository;

import com.enviro.assessment.grad001.KatlegoMtileni.model.Context;

@Repository
public interface ContextRepository extends GenericRepository<Context, Integer> {
	//Class is created to aid the instantiation of the Context class for database communication generically
}
