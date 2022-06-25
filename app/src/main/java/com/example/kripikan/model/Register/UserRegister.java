package com.example.kripikan.model.Register;

import com.google.gson.annotations.SerializedName;

public class UserRegister {

	@SerializedName("iduser")
	private int iduser;

	@SerializedName("password")
	private String password;

	@SerializedName("address")
	private String address;

	@SerializedName("phone")
	private String phone;

	@SerializedName("email")
	private String email;

	@SerializedName("username")
	private String username;

	public void setIduser(int iduser){
		this.iduser = iduser;
	}

	public int getIduser(){
		return iduser;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}
}