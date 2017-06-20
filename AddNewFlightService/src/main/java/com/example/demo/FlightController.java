package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/flightService")
public class FlightController {
	@Autowired
	private FlightRepository userRepository;
	@RequestMapping(path = "/addflight", produces = "application/json", 
			method = RequestMethod.POST
			)
	@ResponseBody
	public void addFlight(@RequestParam Long flightId, @RequestParam Long airlineId, @RequestParam String flightName,
			@RequestParam String airlineName, @RequestParam String cityFrom, @RequestParam String cityTo,
			@RequestParam BigDecimal seatCost, @RequestParam Integer totalSeats) {
		  FlightEntity fe = new
		  FlightEntity(flightId,airlineId,flightName,airlineName,cityFrom,
		  cityTo,seatCost,totalSeats);
		userRepository.save(fe);

	}

}
