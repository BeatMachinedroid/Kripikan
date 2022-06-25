package com.example.kripikan.model.Register;

import com.google.gson.annotations.SerializedName;

public class Register{

	@SerializedName("error")
	private boolean error;

	@SerializedName("message")
	private String message;

	@SerializedName("user")
	private UserRegister userRegister;

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

	public void setUser(UserRegister userRegister){
		this.userRegister = userRegister;
	}

	public UserRegister getUser(){
		return userRegister;
	}
}