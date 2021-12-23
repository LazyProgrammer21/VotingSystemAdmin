package com.votingsystem.model;

public class Election_position {
	private int id;
	private String position;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Election_position(int id, String position) {
		super();
		this.id = id;
		this.position = position;
	}
	public Election_position() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Election_position [id=" + id + ", position=" + position + "]";
	}
	
	

}
