package com.ds.reservationservice;



public class ReservationEvent {
	String roomnumber;
	String customerid;
    String type;
    
	public String getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(String roomnumber) {
		this.roomnumber = roomnumber;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

    
}
