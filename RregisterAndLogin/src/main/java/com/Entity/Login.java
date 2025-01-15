package com.Entity;

public class Login {
	private String s_phoneno;
	private String s_password;
	private String s_name;

	public Login() {

	}

	public Login(String s_phoneno, String s_password, String s_name) {
		super();
		this.s_phoneno = s_phoneno;
		this.s_password = s_password;
		this.s_name = s_name;
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

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	@Override
	public String toString() {
		return "Login [s_phoneno=" + s_phoneno + ", s_password=" + s_password + ", s_name=" + s_name + "]";
	}

}
