package com.ds.trainproject.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "trains")
public class Train {
	
	@Id
    private String id;
	private String trainName;
	private String startDestination;
	private String endDestination;
	private String startTime;
	private String endTime;
	private String availableDays;
	private double tripPrice;
	
	public Train() {}
	
	public Train(String trainName, String startDestination, String endDestination, String startTime,
			String endTime, String availableDays, double tripPrice) {
		super();
		this.trainName = trainName;
		this.startDestination = startDestination;
		this.endDestination = endDestination;
		this.startTime = startTime;
		this.endTime = endTime;
		this.availableDays = availableDays;
		this.tripPrice = tripPrice;
	}
	
	public Train(String id, String trainName, String startDestination, String endDestination, String startTime,
			String endTime, String availableDays, double tripPrice) {
		super();
		this.id = id;
		this.trainName = trainName;
		this.startDestination = startDestination;
		this.endDestination = endDestination;
		this.startTime = startTime;
		this.endTime = endTime;
		this.availableDays = availableDays;
		this.tripPrice = tripPrice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getStartDestination() {
		return startDestination;
	}

	public void setStartDestination(String startDestination) {
		this.startDestination = startDestination;
	}

	public String getEndDestination() {
		return endDestination;
	}

	public void setEndDestination(String endDestination) {
		this.endDestination = endDestination;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getAvailableDays() {
		return availableDays;
	}

	public void setAvailableDays(String availableDays) {
		this.availableDays = availableDays;
	}

	public double getTripPrice() {
		return tripPrice;
	}

	public void setTripPrice(double tripPrice) {
		this.tripPrice = tripPrice;
	}
	
}
