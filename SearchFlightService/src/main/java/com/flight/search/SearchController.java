package com.flight.search;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/SearchFlightService")
public class SearchController {

	@Autowired
	private FlightRepository userRepository;

	@GetMapping(path = "/getflights", produces = "application/json")
	@ResponseBody
	public List<SearchResultEntity> searchAllFlights() {
		System.out.println("inside method");
		Iterable<FlightEntity> allFlights = userRepository.findAll();
		List<SearchResultEntity> list = new ArrayList<SearchResultEntity>();
		Iterator<FlightEntity> it = allFlights.iterator();
		while (it.hasNext()) {
			FlightEntity fi = it.next();
			list.add(convertFlightEntityToSearchEntity(fi));
		}
		return list;
	}
	private SearchResultEntity convertFlightEntityToSearchEntity(FlightEntity fi){
		SearchResultEntity en = new SearchResultEntity();
		en.setAirlineName(fi.getAirlineName());
		en.setCityFrom(fi.getCityFrom());
		en.setCityTo(fi.getCityTo());
		en.setFlightName(fi.getFlightName());
		en.setSeatCost(fi.getSeatCost());
		return en;
	}

	@GetMapping(path = "/flight/{flightId}", produces = "application/json")
	@ResponseBody
	public SearchResultEntity getFlightDetails(@RequestParam Long flightId) {
		
		System.out.println(flightId);
		
		FlightEntity fi =	userRepository.findOne(flightId);
		return convertFlightEntityToSearchEntity(fi);
	}
}
