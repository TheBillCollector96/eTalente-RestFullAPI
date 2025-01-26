package com.enviro.assessment.grad001.KatlegoMtileni.Repository;

import org.springframework.stereotype.Repository;

import com.enviro.assessment.grad001.KatlegoMtileni.model.User;

@Repository
public interface UserRepository extends GenericRepository<User, Integer> {

}
