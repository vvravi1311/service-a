package com.rav.sc.model;

public class seatMap {

	public seatMap(String seatNo, String seatDescription) {
		super();
		this.seatNo = seatNo;
		this.seatDescription = seatDescription;
	}
	public String seatNo;
	public String seatDescription;
	
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public String getSeatDescription() {
		return seatDescription;
	}
	public void setSeatDescription(String seatDescription) {
		this.seatDescription = seatDescription;
	}
	
}
