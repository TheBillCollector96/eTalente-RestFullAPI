package com.enviro.assessment.grad001.KatlegoMtileni.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "coupon")
public class Coupon_Usage {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	@Column(nullable = false)
    private Integer bar;

	@Column(nullable = false)
    private Integer coffeeHouse;

	@Column(nullable = false)
    private Integer carryAway;

	@Column(nullable = false)
    private Integer restaurantLessThan20;

	@Column(nullable = false)
    private Integer restaurant20To50;

	@Column(nullable = false)
	private Boolean accepted;

    @ManyToOne
    @JoinColumn(name = "userID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "couponID")
    private Coupon coupon;

    @ManyToOne
    @JoinColumn(name = "contextID")
    private Context context;

	
}
