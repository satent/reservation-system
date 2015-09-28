package com.satent.airline_hotel_reservation_system.reservationSystem;

import java.util.LinkedList;

public class Customer {

	private String name;
	private String surname;
	private LinkedList<Ticket> tickets;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}
	
	public Ticket getTicket(int ticketID) {
		Ticket ticket = null;
		for(Ticket flagTicket : tickets) {
			if (ticket.getID() == ticketID)  {
				ticket = flagTicket;
				break;
			}
			return ticket;
		}
	}
}
