package com.flight.search;

import java.math.BigDecimal;

public class SearchResultEntity {

	private String cityTo;
	private String cityFrom;
	private String airlineName;
	private String flightName;
	private BigDecimal seatCost;

	public String getCityTo() {
		return cityTo;
	}

	public void setCityTo(String cityTo) {
		this.cityTo = cityTo;
	}

	public String getCityFrom() {
		return cityFrom;
	}

	public void setCityFrom(String cityFrom) {
		this.cityFrom = cityFrom;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public BigDecimal getSeatCost() {
		return seatCost;
	}

	public void setSeatCost(BigDecimal seatCost) {
		this.seatCost = seatCost;
	}

}
