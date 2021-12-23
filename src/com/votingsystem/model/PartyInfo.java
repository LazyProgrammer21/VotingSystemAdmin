package com.votingsystem.model;

import java.sql.Blob;

public class PartyInfo {
	private int partyId;
	private String party_name;
	private Blob symbol;
	public int getPartyId() {
		return partyId;
	}
	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}
	public String getParty_name() {
		return party_name;
	}
	public void setParty_name(String party_name) {
		this.party_name = party_name;
	}
	public Blob getSymbol() {
		return symbol;
	}
	public void setSymbol(Blob symbol) {
		this.symbol = symbol;
	}
	public PartyInfo(int partyId, String party_name, Blob symbol) {
		super();
		this.partyId = partyId;
		this.party_name = party_name;
		this.symbol = symbol;
	}
	public PartyInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PartyInfo [partyId=" + partyId + ", party_name=" + party_name + ", symbol=" + symbol + "]";
	}
	
	
	

}
