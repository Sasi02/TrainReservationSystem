package com.ds.trainproject.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reservations")
public class Reservation {
	
	@Id
	private String id;
	private String userId;
	private String trainId;
	private double price;
	private int noOfTickets;
	private double offer;
	
	public Reservation() {}
	
	public Reservation(String userId, String trainId, double price, int noOfTickets, double offer) {
		super();
		this.userId = userId;
		this.trainId = trainId;
		this.price = price;
		this.noOfTickets = noOfTickets;
		this.offer = offer;
	}
	
	public Reservation(String id, String userId, String trainId, double price, int noOfTickets, double offer) {
		super();
		this.id = id;
		this.userId = userId;
		this.trainId = trainId;
		this.price = price;
		this.noOfTickets = noOfTickets;
		this.offer = offer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTrainId() {
		return trainId;
	}

	public void setTrainId(String trainId) {
		this.trainId = trainId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public double getOffer() {
		return offer;
	}

	public void setOffer(double offer) {
		this.offer = offer;
	}
		
}
