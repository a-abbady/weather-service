package com.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.dto.WeatherResponse;
import com.assignment.service.WeatherService;

@RestController
public class WeatherController {

	@Autowired
	WeatherService weatherService;

	@GetMapping("/weather")
	public WeatherResponse weather(@RequestParam String city) {

		return weatherService.getWeatherData(city);
	}
}
