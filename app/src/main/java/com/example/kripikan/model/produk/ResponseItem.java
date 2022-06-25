package com.example.kripikan.model.produk;

import com.google.gson.annotations.SerializedName;

public class ResponseItem{

	@SerializedName("idproduct")
	private String idproduct;

	@SerializedName("img")
	private String img;

	@SerializedName("price")
	private String price;

	@SerializedName("idcate")
	private String idcate;

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private String description;

	public void setIdproduct(String idproduct){
		this.idproduct = idproduct;
	}

	public String getIdproduct(){
		return idproduct;
	}

	public void setImg(String img){
		this.img = img;
	}

	public String getImg(){
		return img;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public String getPrice(){
		return price;
	}

	public void setIdcate(String idcate){
		this.idcate = idcate;
	}

	public String getIdcate(){
		return idcate;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}
}