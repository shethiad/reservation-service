package com.ds.reservationservice;


import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "reservation")
public class Reservation {
    
	@Id
    @Column(name = "bookingid", nullable = false, length = 50)
    private String bookingid;
	
    @Column(name = "roomnumber", nullable = false, length = 50)
    private String roomnumber;

    @Column(name = "customerid", length = 50)
    private String customerid;

    @Column(name = "customername", nullable = false, length = 50)
    private String customername;

    @Column(name = "roomrate", length = 100)
    private String roomrate;

    @Column(name = "bookingdate", length = 20)
    private Date bookingdate;

	public String getBookingid() {
		return bookingid;
	}

	public void setBookingid(String bookingid) {
		this.bookingid = bookingid;
	}

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

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getRoomrate() {
		return roomrate;
	}

	public void setRoomrate(String roomrate) {
		this.roomrate = roomrate;
	}

	public Date getBookingdate() {
		return bookingdate;
	}

	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}

 
}