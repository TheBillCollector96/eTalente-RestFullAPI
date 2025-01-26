package com.enviro.assessment.grad001.KatlegoMtileni.Repository;

import org.springframework.stereotype.Repository;

import com.enviro.assessment.grad001.KatlegoMtileni.model.Coupon;

@Repository
public interface CouponRepository extends GenericRepository<Coupon, Integer> {
	//Class is created to aid the instantiation of the Coupon class for database communication generically
}
