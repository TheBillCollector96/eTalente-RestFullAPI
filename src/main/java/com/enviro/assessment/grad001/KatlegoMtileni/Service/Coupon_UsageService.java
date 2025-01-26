package com.enviro.assessment.grad001.KatlegoMtileni.Service;

import org.springframework.stereotype.Service;

import com.enviro.assessment.grad001.KatlegoMtileni.Repository.Coupon_UsageRepository;
import com.enviro.assessment.grad001.KatlegoMtileni.Repository.GenericRepository;
import com.enviro.assessment.grad001.KatlegoMtileni.model.Coupon_Usage;

@Service
public class Coupon_UsageService extends GenericService<Coupon_Usage, Integer> {

	//Passes the an object of Coupon_UsageRepository to to GenericServices to communicate with database from the Coupon_Usage table
	public Coupon_UsageService(Coupon_UsageRepository repository) {
		super(repository);
	}

}
