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
@Table(name = "context")
public class Context {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer contextID;
	
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

    @OneToMany(mappedBy = "context")
    private List<Coupon_Usage> usages;
    
    public Context() {}
    
    public Context(Integer contextId, String destination, String passanger, String weather, Integer temperature, String time, Boolean toCouponGEQ5min, Boolean toCouponGEQ15min, Boolean toCouponGEQ25min, Boolean directionSame, Boolean directionOpp, List<Coupon_Usage> usages) {
		this.contextID = contextId;
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
		this.usages = usages;
	}
    
    public Context(Integer contextId, String destination, String passanger, String weather, Integer temperature, String time, Boolean toCouponGEQ5min, Boolean toCouponGEQ15min, Boolean toCouponGEQ25min, Boolean directionSame, Boolean directionOpp) {
		this.contextID = contextId;
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


	public Integer getContextID() {
		return contextID;
	}


	public void setContextID(Integer contextId) {
		this.contextID = contextId;
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

	public Boolean getToCouponGEQ5min() {
		return toCouponGEQ5min;
	}

	public void setToCouponGEQ5min(Boolean toCouponGEQ5min) {
		this.toCouponGEQ5min = toCouponGEQ5min;
	}

	public Boolean getToCouponGEQ15min() {
		return toCouponGEQ15min;
	}

	public void setToCouponGEQ15min(Boolean toCouponGEQ15min) {
		this.toCouponGEQ15min = toCouponGEQ15min;
	}

	public Boolean getToCouponGEQ25min() {
		return toCouponGEQ25min;
	}

	public void setToCouponGEQ25min(Boolean toCouponGEQ25min) {
		this.toCouponGEQ25min = toCouponGEQ25min;
	}

	public Boolean getDirectionSame() {
		return directionSame;
	}

	public void setDirectionSame(Boolean directionSame) {
		this.directionSame = directionSame;
	}

	public Boolean getDirectionOpp() {
		return directionOpp;
	}

	public void setDirectionOpp(Boolean directionOpp) {
		this.directionOpp = directionOpp;
	}

	public List<Coupon_Usage> getUsages() {
		return usages;
	}

	public void setUsages(List<Coupon_Usage> usages) {
		this.usages = usages;
	}
    
	
}
