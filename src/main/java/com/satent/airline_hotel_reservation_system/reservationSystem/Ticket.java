package com.satent.airline_hotel_reservation_system.reservationSystem;

public class Ticket {
	
	private int ID;
	private int price;
	private Seat seat;
	private String travellerName;
	private String travellerSurname;
	private String IDType;
	private String departureTime;
	private String arrivalTime;
	private String startCity;
	private String endCity;
	
	public Ticket(int ID, int price, Seat seat, String departureTime, String arrivalTime, String startCity, String endCity, String travellerName, String travellerSurname, String IDType) {
		setID(ID);
		setPrice(price);
		setSeat(seat);
		setDepartureTime(departureTime);
		setArrivalTime(arrivalTime);
		setStartCity(startCity);
		setTravellerName(travellerName);
		setTravellerSurname(travellerSurname);
		setIDType(IDType);
	}
	
	public int getID() {
		return this.ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Seat getSeat() {
		return this.seat;
	}
	
	public void setSeat(Seat seat) {
		this.seat=seat;
	}
	
	public String getDepartureTime() {
		return this.departureTime;
	}
	
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	
	public String getArrivalTime() {
		return this.arrivalTime;
	}
	
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	public String getStartCity() {
		return this.startCity;
	}
	
	public void setStartCity(String startCity) {
		this.startCity = startCity;
	}
	
	public String getEndCity() {
		return this.endCity;
	}
	
	public void setEndCity(String endCity) {
		this.endCity = endCity;
	}
	
	public String getTravellerName() {
		return this.travellerName;
	}
	
	public void setTravellerName(String travellerName) {
		this.travellerName = travellerName;
	}
	
	public String getTravellerSurname() {
		return this.travellerSurname;
	}
	
	public void setTravellerSurname(String travellerSurname) {
		this.travellerSurname = travellerSurname;
	}
	
	public void setIDType(String IDType) {
		this.IDType = IDType;
	}
	
	public String getIDType() {
		return this.IDType;
	}
}
