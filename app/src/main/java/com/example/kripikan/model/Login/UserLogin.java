package com.example.kripikan.model.Login;

public class UserLogin {
	private int iduser;
	private String password;
	private String address;
	private String phone;
	private String email;
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
