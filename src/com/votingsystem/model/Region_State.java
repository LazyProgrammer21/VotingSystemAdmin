package com.votingsystem.model;

public class Region_State {

	
	private int idRegion_State;
	private int province;
	private String region;
	public int getIdRegion_State() {
		return idRegion_State;
	}
	public void setIdRegion_State(int idRegion_State) {
		this.idRegion_State = idRegion_State;
	}
	public int getProvince() {
		return province;
	}
	public void setProvince(int province) {
		this.province = province;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Region_State(int idRegion_State, int province, String region) {
		super();
		this.idRegion_State = idRegion_State;
		this.province = province;
		this.region = region;
	}
	public Region_State() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Region_State [idRegion_State=" + idRegion_State + ", province=" + province + ", region=" + region + "]";
	}
	
	
}
