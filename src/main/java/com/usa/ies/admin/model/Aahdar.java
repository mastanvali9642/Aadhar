package com.usa.ies.admin.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Aahdar {
	private int adharno;
	private String aname;
	private String sex;
	private String address;
	public int getAdharno() {
		return adharno;
	}
	public void setAdharno(int adharno) {
		this.adharno = adharno;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Aahdar [adharno=" + adharno + ", aname=" + aname + ", sex=" + sex + ", address=" + address + "]";
	}
	


}
