package com.masai.dto;

import java.sql.Date;

public interface Customer {

	int getId();

	int getBranchID();

	String getFirstName();

	String getLastName();

	String getAddress();

	String getGender();

	String getPhone();

	String getemail();

	Date getDate();

	String getPassword();

	void setID(int int1);
	
	void setBranchID(int int1);


	void setPassword(String string);

	void setFirstName(String string);

	void setLastName(String string);

	void setGender(String string);

	void setAddress(String string);

	void setPhone(String string);

	void setEmail(String string);

	void setDate(String string);

	

}
