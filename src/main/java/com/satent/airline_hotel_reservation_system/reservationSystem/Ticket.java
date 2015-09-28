package com.satent.airline_hotel_reservation_system.reservationSystem;

public class Ticket {
	
	private int ID;
	private int price;
	private Seat seat;
	private String travellerName;
	private String travellerSurname;
	private String idType;
	private String departureTime;
	private String arrivalTime;
	private String startCity;
	private String endCity;
	
	public Ticket(int ID, int price, Seat seat, String departureTime, String arrivalTime, String startCity, String endCity) {
		
	}
	
	public int getID() {
		return this.ID;
	}
	
	public void setID(int ID) {
		this.ti
	}
	public int getPrice() {
		return this.price;
	}
	
	public Seat getSeat() {
		return this.seat;
	}
	
	public String getDepartureTime() {
		return this.departureTime;
	}
	
	public String getArrivalTime() {
		return this.arrivalTime;
	}
	
	public String getStartCity() {
		return this.startCity;
	}
	
	public String getEndCity() {
		return this.endCity;
	}
}
