package com.enviro.assessment.grad001.KatlegoMtileni.Service;

import org.springframework.stereotype.Service;

import com.enviro.assessment.grad001.KatlegoMtileni.Repository.CouponRepository;
import com.enviro.assessment.grad001.KatlegoMtileni.Repository.GenericRepository;
import com.enviro.assessment.grad001.KatlegoMtileni.model.Coupon;

@Service
public class CouponService extends GenericService<Coupon, Integer> {

	public CouponService(CouponRepository repository) {
		super(repository);
	}

}
