package com.flightsearch.client;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.flightsearch.controller.GetFlightControllerClient;

@SpringBootApplication
public class FlightSearchClientApp {

	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx = SpringApplication.run(
				FlightSearchClientApp.class, args);
		
		GetFlightControllerClient fightControllerClient=ctx.getBean(GetFlightControllerClient.class);
		System.out.println(fightControllerClient);
		fightControllerClient.getFlights();
		
	}
	
	@Bean
	public  GetFlightControllerClient  consumerControllerClient()
	{
		return  new GetFlightControllerClient();
	}
}