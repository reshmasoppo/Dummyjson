package com.example.dummyjson;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("myorder")
	private List<MyorderItem> myorder;

	@SerializedName("accountsettings")
	private List<AccountsettingsItem> accountsettings;

	@SerializedName("profilesettings")

	private List<ProfilesettingsItem> profilesettings;

	public void setMyorder(List<MyorderItem> myorder)
	{
		this.myorder = myorder;
	}

	public List<MyorderItem> getMyorder()
	{
		return myorder;
	}

	public void setAccountsettings(List<AccountsettingsItem> accountsettings)
	{
		this.accountsettings = accountsettings;
	}

	public List<AccountsettingsItem> getAccountsettings()
	{
		return accountsettings;
	}

	public void setProfilesettings(List<ProfilesettingsItem> profilesettings)
	{
		this.profilesettings = profilesettings;
	}

	public List<ProfilesettingsItem> getProfilesettings()
	{
		return profilesettings;
	}

}