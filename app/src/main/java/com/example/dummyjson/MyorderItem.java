package com.example.dummyjson;

import com.google.gson.annotations.SerializedName;


public class MyorderItem{

	@SerializedName("id")
	private int id;

	@SerializedName("order_name")
	private String orderName;

	@SerializedName("order_value")
	private String orderValue;

	@SerializedName("imgLeft")
	private String imgLeft;

	@SerializedName("isHeader")
	private String isHeader;

	@SerializedName("textLeft")
	private String textLeft;

	@SerializedName("headerTitle")
	private String headerTitle;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setOrderName(String orderName){
		this.orderName = orderName;
	}

	public String getOrderName(){
		return orderName;
	}

	public void setOrderValue(String orderValue){
		this.orderValue = orderValue;
	}

	public String getOrderValue(){
		return orderValue;
	}

	public void setImgLeft(String imgLeft){
		this.imgLeft = imgLeft;
	}

	public String getImgLeft(){
		return imgLeft;
	}

	public void setIsHeader(String isHeader){
		this.isHeader = isHeader;
	}

	public String getIsHeader(){
		return isHeader;
	}

	public void setTextLeft(String textLeft){
		this.textLeft = textLeft;
	}

	public String getTextLeft(){
		return textLeft;
	}

	public void setHeaderTitle(String headerTitle){
		this.headerTitle = headerTitle;
	}

	public String getHeaderTitle(){
		return headerTitle;
	}

	}