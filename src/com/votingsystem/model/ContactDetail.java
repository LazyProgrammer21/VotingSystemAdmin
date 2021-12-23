package com.votingsystem.model;

public class ContactDetail {

	private int Idcontact;
	private String ContactDetail;
	
	public int getIdcontact() {
		return Idcontact;
	}
	public void setIdcontact(int idcontact) {
		Idcontact = idcontact;
	}
	public String getContactDetail() {
		return ContactDetail;
	}
	public void setContactDetail(String contactDetail) {
		ContactDetail = contactDetail;
	}
	public ContactDetail(int idcontact, String contactDetail) {
		super();
		Idcontact = idcontact;
		ContactDetail = contactDetail;
	}
	public ContactDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ContactDetail [Idcontact=" + Idcontact + ", ContactDetail=" + ContactDetail + "]";
	}
	
	
	
}
