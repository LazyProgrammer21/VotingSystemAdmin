package com.votingsystem.service;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.votingsystem.db.db;
import com.votingsystem.model.AboutUs;
import com.votingsystem.model.ContactDetail;
import com.votingsystem.model.Election_position;
import com.votingsystem.model.PartyInfo;
import com.votingsystem.model.Region_State;

public class adminServiceImpl implements adminService {

		Connection con = null;
		public adminServiceImpl(){
			//calling a connection
			con = db.getConnection();
			
		}


	@Override
	public boolean login(String email, String password) {
		boolean x = false;
		//for login
		String sql = "Select Email, Password1 from votingsystem.admin where Email=? and Password1=?";
		
	
		try {
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, password);
		
			
			ResultSet rs = pst.executeQuery();
			
			
			while(rs.next()) {
				String db_name=rs.getString("Email");
				String db_password=rs.getString("Password1");
			
			
					if(email.equals(db_name)&&password.equals(db_password)) {
						x=true;
						return x;
					}else {
						return false;
					}
				}
				
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return x;
	}

	@Override
	public boolean change_pp(String password, String email) {
		boolean x=false;
		String sql = "Update admin set Password1 =? where Email=?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, password);
			stmt.setString(2, email);
			stmt.execute();
			x=true;
			return x;
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog(null, e);
			System.out.println("Error while updating password.");
			x=false;
			return x;
		}
		
	
	}

	@Override
	public String getAdminKey(String email) {
	String key="";
		//for login
		String sql = "Select adminKey from votingsystem.admin where Email=?";
	
	
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, email);
	
			
			ResultSet rs = pst.executeQuery();
			
			
			while(rs.next()) {
				key=rs.getString("adminKey");
			}
				
		}
		catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Failed to fetch adminKey.....!!");
			System.out.println(e);
		}
		return key;
	}

	@Override
	public List<ContactDetail> updateContact() {
		
		List<ContactDetail> contact_info = new ArrayList<>();
		
		String sql = "Select * from votingsystem.region_state";
	
	
		try {
			
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			
			while(rs.next()) {
				ContactDetail cd  = new ContactDetail();
				int cd_id=rs.getInt("idContactUs");
				
				String cd_detail = rs.getString("ContactDetail");
				
				cd.setIdcontact(cd_id);
				cd.setContactDetail(cd_detail);
				contact_info.add(cd);
			
				}
				
			
		}
		catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e);
			System.out.println(e);
	
		}
		return contact_info;
	}

	@Override
	public List<AboutUs> updateAboutUs() {
		
		List<AboutUs> aboutUs = new ArrayList<>();
		
		String sql = "Select * from votingsystem.aboutus";
	
	
		try {
			
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			
			while(rs.next()) {
				AboutUs us= new AboutUs();
				int id_aboutus=rs.getInt("idAboutUs");
				String intro =rs.getString("Introduction");
				String aim = rs.getString("AimsObjective");
				String pbrlmstatement = rs.getString("ProblemStatement");
				String chlange = rs.getString("Challenges");
				
				us.setAboutUsId(id_aboutus);
				us.setAims(aim);
				us.setIntroduction(intro);
				us.setProblemstatement(pbrlmstatement);
				us.setChallenges(chlange);
				aboutUs.add(us);
			
				}
				
			
		}
		catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e);
			System.out.println(e);
	
		}
		return aboutUs;
	}


	@Override
	public boolean addCandidate() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public List<Election_position> getPosition() {

		List<Election_position> position_info = new ArrayList<>();
		
		String sql = "Select * from votingsystem.electionposition";
	
	
		try {
			
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			
			while(rs.next()) {
				Election_position pinfo=new Election_position();
				
				int positionId =rs.getInt("idElectionPosition");
				String position = rs.getString("Position");
				
				pinfo.setId(positionId);
				pinfo.setPosition(position);
				
				position_info.add(pinfo);
			
				}
				
			
		}
		catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e);
			System.out.println(e);
	
		}
		return position_info;
	}


	@Override
	public List<Region_State> getRegionState() {
		
		List<Region_State> state_info = new ArrayList<>();
		
		String sql = "Select * from votingsystem.region_state";
	
	
		try {
			
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			
			while(rs.next()) {
				Region_State r_info = new Region_State();
				int state_id=rs.getInt("idRegion_State");
				int state_province =rs.getInt("Province");
				String Region = rs.getString("Region");
				
				r_info.setIdRegion_State(state_id);
				r_info.setProvince(state_province);
				r_info.setRegion(Region);
				state_info.add(r_info);
			
				}
				
			
		}
		catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e);
			System.out.println(e);
	
		}
		return state_info;
	}
	


	@Override
	public List<PartyInfo> getParty() {
		
		List<PartyInfo> p_info = new ArrayList<>();
	
		String sql = "Select * from votingsystem.party";
	
	
		try {
			
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			
			while(rs.next()) {
				PartyInfo pinfo = new PartyInfo();
				int p_id=rs.getInt("idParty");
				String p_name=rs.getString("party_name");
				Blob p_symbol = rs.getBlob("Symbol");
				
				pinfo.setPartyId(p_id);
				pinfo.setParty_name(p_name);
				pinfo.setSymbol(p_symbol);
				p_info.add(pinfo);
			
				}
				
			
		}
		catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e);
			System.out.println(e);
	
		}
		return p_info;
	}

}
