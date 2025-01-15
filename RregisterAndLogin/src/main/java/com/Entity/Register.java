package com.Entity;

public class Register {
	private int s_id;
	private String s_name;
	private String s_std;
	private int s_rollno;
	private int s_age;
	private String s_city;
	private String s_gender;
	private String course;
	private  String s_dob;
	private String s_phoneno;
	private String s_password;
	
	private Login log;

	public Register() {
		
	}

	public Register(int s_id, String s_name, String s_std, int s_rollno, int s_age, String s_city, String s_gender,
			String course, String s_dob, String s_phoneno, String s_password, Login log) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_std = s_std;
		this.s_rollno = s_rollno;
		this.s_age = s_age;
		this.s_city = s_city;
		this.s_gender = s_gender;
		this.course = course;
		this.s_dob = s_dob;
		this.s_phoneno = s_phoneno;
		this.s_password = s_password;
		this.log = log;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_std() {
		return s_std;
	}

	public void setS_std(String s_std) {
		this.s_std = s_std;
	}

	public int getS_rollno() {
		return s_rollno;
	}

	public void setS_rollno(int s_rollno) {
		this.s_rollno = s_rollno;
	}

	public int getS_age() {
		return s_age;
	}

	public void setS_age(int s_age) {
		this.s_age = s_age;
	}

	public String getS_city() {
		return s_city;
	}

	public void setS_city(String s_city) {
		this.s_city = s_city;
	}

	public String getS_gender() {
		return s_gender;
	}

	public void setS_gender( String s_gender) {
		this.s_gender = s_gender;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getS_dob() {
		return s_dob;
	}

	public void setS_dob(String s_dob) {
		this.s_dob = s_dob;
	}

	public String getS_phoneno() {
		return s_phoneno;
	}

	public void setS_phoneno(String s_phoneno) {
		this.s_phoneno = s_phoneno;
	}

	public String getS_password() {
		return s_password;
	}

	public void setS_password(String s_password) {
		this.s_password = s_password;
	}

	public Login getLog() {
		return log;
	}

	public void setLog(Login log) {
		this.log = log;
	}

	@Override
	public String toString() {
		return "Register [s_id=" + s_id + ", s_name=" + s_name + ", s_std=" + s_std + ", s_rollno=" + s_rollno
				+ ", s_age=" + s_age + ", s_city=" + s_city + ", s_gender=" + s_gender + ", course=" + course
				+ ", s_dob=" + s_dob + ", s_phoneno=" + s_phoneno + ", s_password=" + s_password + ", log=" + log + "]";
	}
	
	

}
