package com.example.dummyjson;

import com.google.gson.annotations.SerializedName;


public class ProfilesettingsItem{

	@SerializedName("id")
	private int id;

	@SerializedName("profile_data")
	private String profileData;

	@SerializedName("profile_desc")
	private String profileDesc;

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

	public void setProfileData(String profileData){
		this.profileData = profileData;
	}

	public String getProfileData(){
		return profileData;
	}

	public void setProfileDesc(String profileDesc){
		this.profileDesc = profileDesc;
	}

	public String getProfileDesc(){
		return profileDesc;
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