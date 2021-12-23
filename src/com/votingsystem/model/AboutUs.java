package com.votingsystem.model;

public class AboutUs {
	private int aboutUsId;
	private String introduction;
	private String aims;
	private String problemstatement;
	private String challenges;
	public int getAboutUsId() {
		return aboutUsId;
	}
	public void setAboutUsId(int aboutUsId) {
		this.aboutUsId = aboutUsId;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getAims() {
		return aims;
	}
	public void setAims(String aims) {
		this.aims = aims;
	}
	public String getProblemstatement() {
		return problemstatement;
	}
	public void setProblemstatement(String problemstatement) {
		this.problemstatement = problemstatement;
	}
	public String getChallenges() {
		return challenges;
	}
	public void setChallenges(String challenges) {
		this.challenges = challenges;
	}
	public AboutUs(int aboutUsId, String introduction, String aims, String problemstatement, String challenges) {
		super();
		this.aboutUsId = aboutUsId;
		this.introduction = introduction;
		this.aims = aims;
		this.problemstatement = problemstatement;
		this.challenges = challenges;
	}
	public AboutUs() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AboutUs [aboutUsId=" + aboutUsId + ", introduction=" + introduction + ", aims=" + aims
				+ ", problemstatement=" + problemstatement + ", challenges=" + challenges + "]";
	}

	
	
	
	
	
	

}
