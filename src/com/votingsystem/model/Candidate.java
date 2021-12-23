package com.votingsystem.model;

public class Candidate {
	
	private int idCandidate;
	private String Name;
	public int getIdCandidate() {
		return idCandidate;
	}
	public void setIdCandidate(int idCandidate) {
		this.idCandidate = idCandidate;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Candidate(int idCandidate, String name) {
		super();
		this.idCandidate = idCandidate;
		Name = name;
	}
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Candidate [idCandidate=" + idCandidate + ", Name=" + Name + "]";
	}
	
	
	

}
