package com.cg.bean;

public class StudentBean {
	
	private int studId;
	private String studName;
	private int age;
	private String state;
	private String gender;
	private int centum;
	private int attempts;
	private int total;
	
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getCentum() {
		return centum;
	}
	public void setCentum(int centum) {
		this.centum = centum;
	}
	public int getAttempts() {
		return attempts;
	}
	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	

	public StudentBean() 
	{
		
	}
	public StudentBean(int studId, String studName, int age,
			String state, String gender, int centum, int attempts,
			int total) 
	{
			super();
			this.studId=studId;
		this.studName = studName;
		this.age = age;
		this.state = state;
		this.gender = gender;
		this.centum = centum;
		this.attempts = attempts;
		this.total = total;
		
		
	}
	@Override
	public String toString() {
		return "StudentBean [studId=" + studId + ", studName=" + studName
				+ ", age=" + age + ", state=" + state + ", gender=" + gender
				+ ", centum=" + centum + ", attempts=" + attempts + ", total="
				+ total + "]";
	}
	
	
	
}
