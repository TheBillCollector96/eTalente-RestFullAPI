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
@Table(name = "coupon_usage")
public class Coupon_Usage {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer usageID;

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

    public Coupon_Usage() {}
    
	public Coupon_Usage(Integer usageID, Integer bar, Integer coffeeHouse, Integer carryAway, Integer restaurantLessThan20, Integer restaurant20To50, Boolean accepted, User user, Coupon coupon, Context context) {
		this.usageID = usageID;
		this.bar = bar;
		this.coffeeHouse = coffeeHouse;
		this.carryAway = carryAway;
		this.restaurantLessThan20 = restaurantLessThan20;
		this.restaurant20To50 = restaurant20To50;
		this.accepted = accepted;
		this.user = user;
		this.coupon = coupon;
		this.context = context;
	}

	public Integer getUsageID() {
		return usageID;
	}

	public void setUsageID(Integer usageID) {
		this.usageID = usageID;
	}

	public Integer getBar() {
		return bar;
	}

	public void setBar(Integer bar) {
		this.bar = bar;
	}

	public Integer getCoffeeHouse() {
		return coffeeHouse;
	}

	public void setCoffeeHouse(Integer coffeeHouse) {
		this.coffeeHouse = coffeeHouse;
	}

	public Integer getCarryAway() {
		return carryAway;
	}

	public void setCarryAway(Integer carryAway) {
		this.carryAway = carryAway;
	}

	public Integer getRestaurantLessThan20() {
		return restaurantLessThan20;
	}

	public void setRestaurantLessThan20(Integer restaurantLessThan20) {
		this.restaurantLessThan20 = restaurantLessThan20;
	}

	public Integer getRestaurant20To50() {
		return restaurant20To50;
	}

	public void setRestaurant20To50(Integer restaurant20To50) {
		this.restaurant20To50 = restaurant20To50;
	}

	public Boolean getAccepted() {
		return accepted;
	}

	public void setAccepted(Boolean accepted) {
		this.accepted = accepted;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Coupon getCoupon() {
		return coupon;
	}

	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	
}
