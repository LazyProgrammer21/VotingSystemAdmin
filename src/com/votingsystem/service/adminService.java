package com.votingsystem.service;

import java.util.List;

import com.votingsystem.model.AboutUs;
import com.votingsystem.model.ContactDetail;
import com.votingsystem.model.Election_position;
import com.votingsystem.model.PartyInfo;
import com.votingsystem.model.Region_State;

public interface adminService {
	

	 boolean login(String adminemail, String password);
	 boolean change_pp(String password, String adminemail);
	 String getAdminKey(String adminemail);
	 List<ContactDetail> updateContact();
	 List<AboutUs> updateAboutUs();
	 boolean addCandidate();
	 List<Election_position> getPosition();
	 List<Region_State> getRegionState();
	 List<PartyInfo> getParty();
	
	
	
	

}
