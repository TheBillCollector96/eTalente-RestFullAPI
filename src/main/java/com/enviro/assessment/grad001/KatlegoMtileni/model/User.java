package com.enviro.assessment.grad001.KatlegoMtileni.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user")
public class User {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userID;
	
	@Column(nullable = false, length = 30)
	private String gender;
	
	@Column(nullable = false)
	private int age;
	
	@Column(nullable = false, length = 30)
	private String maritalStatus;
	
	@Column(nullable = false)
	private boolean hasChildren;
	
	@Column(nullable = false, length = 30)
	private String education;
	
	@Column(nullable = false, length = 30)
	private String occupation;
	
	@Column(nullable = false, length = 30)
	private String income;
	
	@Column(nullable = false, length = 30)
	private String car;

    //@OneToMany(mappedBy = "user")
    //private List<Behavior> behaviors;

	public User() {}
	
	public User(Integer userID, String gender, int age, String maritalStatus, boolean hasChildren, String education, String occupation, String income, String car) {
		this.userID = userID;
		this.gender = gender;
		this.age = age;
		this.maritalStatus = maritalStatus;
		this.hasChildren = hasChildren;
		this.education = education;
		this.occupation = occupation;
		this.income = income;
		this.car = car;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public boolean isHasChildren() {
		return hasChildren;
	}

	public void setHasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}
	
	
	
}
