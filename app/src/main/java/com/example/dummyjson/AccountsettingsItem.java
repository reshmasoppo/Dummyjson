package com.example.dummyjson;

import com.google.gson.annotations.SerializedName;


public class AccountsettingsItem{

	@SerializedName("account_details")
	private String accountDetails;

	@SerializedName("id")
	private int id;

	@SerializedName("imgLeft")
	private String imgLeft;

	@SerializedName("isHeader")
	private boolean isHeader;

	@SerializedName("textLeft")
	private String textLeft;

	@SerializedName("headerTitle")
	private String headerTitle;

	public void setAccountDetails(String accountDetails){
		this.accountDetails = accountDetails;
	}

	public String getAccountDetails(){
		return accountDetails;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setImgLeft(String imgLeft)
	{
		this.imgLeft = imgLeft;
	}

	public String getImgLeft()
	{
		return imgLeft;
	}

	public void setIsHeader(boolean isHeader)
	{
		this.isHeader = isHeader;
	}

	public boolean getIsHeader()
	{
		return isHeader;
	}

	public void setTextLeft(String textLeft)
	{
		this.textLeft = textLeft;
	}

	public String getTextLeft()
	{
		return textLeft;
	}

	public void setHeaderTitle(String headerTitle)
	{
		this.headerTitle = headerTitle;
	}

	public String getHeaderTitle()
	{
		return headerTitle;
	}

	}