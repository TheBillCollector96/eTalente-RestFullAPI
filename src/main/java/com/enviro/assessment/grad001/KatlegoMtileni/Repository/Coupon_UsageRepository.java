package com.enviro.assessment.grad001.KatlegoMtileni.Repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.enviro.assessment.grad001.KatlegoMtileni.model.Coupon_Usage;

@Primary
@Repository
public interface Coupon_UsageRepository extends GenericRepository<Coupon_Usage, Integer> {
	//Class is created to aid the instantiation of the Coupon_Usage class for database communication generically
}
