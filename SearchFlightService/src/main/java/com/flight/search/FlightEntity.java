package com.flight.search;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlightEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long flightId;
	private Long airlineId;
	private String flightName;
	private String airlineName;
	private String cityFrom;
	private String cityTo;
	private BigDecimal seatCost;
	private Integer totalSeats;

	
	public FlightEntity(){
		
	}
	public FlightEntity(Long flightId, Long airlineId, String flightName, String airlineName, String cityFrom,
			String cityTo, BigDecimal seatCost, Integer totalSeats) {
		this.flightId=flightId;
		this.flightName=flightName;
		this.airlineId=airlineId;
		this.airlineName=airlineName;
		this.seatCost=seatCost;
		this.cityFrom=cityFrom;
		this.totalSeats=totalSeats;
		this.cityTo=cityTo;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public Long getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(Long airlineId) {
		this.airlineId = airlineId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getCityFrom() {
		return cityFrom;
	}

	public void setCityFrom(String cityFrom) {
		this.cityFrom = cityFrom;
	}

	public String getCityTo() {
		return cityTo;
	}

	public void setCityTo(String cityTo) {
		this.cityTo = cityTo;
	}

	public BigDecimal getSeatCost() {
		return seatCost;
	}

	public void setSeatCost(BigDecimal seatCost) {
		this.seatCost = seatCost;
	}

	public Integer getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(Integer totalSeats) {
		this.totalSeats = totalSeats;
	}

}
