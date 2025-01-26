package com.enviro.assessment.grad001.KatlegoMtileni.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "coupon")
public class Coupon {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer couponId;

	@Column(nullable = false, length = 30)
	private String coupon;

	@Column(nullable = false, length = 30)
	private String expiration;

	public Coupon(Integer couponId, String coupon, String expiration) {
		this.couponId = couponId;
		this.coupon = coupon;
		this.expiration = expiration;
	}

	
	
}
