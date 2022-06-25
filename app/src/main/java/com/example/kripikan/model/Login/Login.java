package com.example.kripikan.model.Login;

public class Login{
	private boolean error;
	private String message;
	private UserLogin userLogin;

	public void setError(boolean error){
		this.error = error;
	}

	public boolean isError(){
		return error;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setUser(UserLogin userLogin){
		this.userLogin = userLogin;
	}

	public UserLogin getUser(){
		return userLogin;
	}
}
