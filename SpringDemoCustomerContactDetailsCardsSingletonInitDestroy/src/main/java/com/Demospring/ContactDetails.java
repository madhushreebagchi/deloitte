package com.Demospring;

public class ContactDetails {
private String mobileNumber;
private String emailId;
public ContactDetails() {
	
}

public ContactDetails(String mobileNumber, String emailId) {
	super();
	this.mobileNumber = mobileNumber;
	this.emailId = emailId;
}

public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}

@Override
public String toString() {
	return "ContactDetails [mobileNumber=" + mobileNumber + ", emailId=" + emailId + "]";
}

}
