package com.enviro.assessment.grad001.KatlegoMtileni.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "coupon")
public class Coupon {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer couponID;

	@Column(nullable = false, length = 30)
	private String couponName;

	@Column(nullable = false, length = 30)
	private String expiration;

	@OneToMany(mappedBy = "coupon")
    private List<Coupon_Usage> usages;
	
    public Coupon() {}
    
	public Coupon(Integer couponId, String coupon, String expiration, List<Coupon_Usage> usages) {
		this.couponID = couponId;
		this.couponName = coupon;
		this.expiration = expiration;
		this.usages = usages;
	}
    
	public Coupon(Integer couponId, String coupon, String expiration) {
		this.couponID = couponId;
		this.couponName = coupon;
		this.expiration = expiration;
	}

	public Integer getCouponID() {
		return couponID;
	}

	public void setCouponID(Integer couponID) {
		this.couponID = couponID;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public List<Coupon_Usage> getUsages() {
		return usages;
	}

	public void setUsages(List<Coupon_Usage> usages) {
		this.usages = usages;
	}

	
	
}
