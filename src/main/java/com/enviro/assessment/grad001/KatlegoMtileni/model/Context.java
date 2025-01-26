package com.enviro.assessment.grad001.KatlegoMtileni.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "context")
public class Context {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer contextId;
	
	@Column(nullable = false, length = 30)
	private String destination;
    
	@Column(nullable = false, length = 30)
	private String passanger;
    
	@Column(nullable = false, length = 30)
	private String weather;
    
	@Column(nullable = false, length = 30)
	private Integer temperature;
    
	@Column(nullable = false, length = 30)
	private String time;

	@Column(nullable = false)
	private Boolean toCouponGEQ5min;

	@Column(nullable = false)
	private Boolean toCouponGEQ15min;

	@Column(nullable = false)
	private Boolean toCouponGEQ25min;
	
	@Column(nullable = false)
	private Boolean directionSame;
    
	@Column(nullable = false)
	private Boolean directionOpp;

    //@OneToMany(mappedBy = "context")
    //private List<Behavior> behaviors;
    
    public Context() {}
    
    public Context(Integer contextId, String destination, String passanger, String weather, Integer temperature, String time, Boolean toCouponGEQ5min, Boolean toCouponGEQ15min, Boolean toCouponGEQ25min, Boolean directionSame, Boolean directionOpp) {
		this.contextId = contextId;
		this.destination = destination;
		this.passanger = passanger;
		this.weather = weather;
		this.temperature = temperature;
		this.time = time;
		this.toCouponGEQ5min = toCouponGEQ5min;
		this.toCouponGEQ15min = toCouponGEQ15min;
		this.toCouponGEQ25min = toCouponGEQ25min;
		this.directionSame = directionSame;
		this.directionOpp = directionOpp;
	}


	public Integer getContextId() {
		return contextId;
	}


	public void setContextId(Integer contextId) {
		this.contextId = contextId;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getPassanger() {
		return passanger;
	}


	public void setPassanger(String passanger) {
		this.passanger = passanger;
	}


	public String getWeather() {
		return weather;
	}


	public void setWeather(String weather) {
		this.weather = weather;
	}


	public Integer getTemperature() {
		return temperature;
	}


	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}
    
    
    
}
