package com.rav.sc.controller;

import java.util.Arrays;
import java.util.List;
import com.rav.sc.model.seatMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class serviceAController {

	@RequestMapping("/health")
	public String hello() {
		return "Service is up and running : all OK";
	}
	
	@RequestMapping("/seat-map")
	public List<seatMap> seatMap() {
		return Arrays.asList(
				new seatMap("1A", "row-1"),
				new seatMap("1B", "row-1"),
				new seatMap("1C", "row-1"),
				new seatMap("2A", "row-2"),
				new seatMap("2B", "row-2"),
				new seatMap("2C", "row-2")
				);
	}

}
