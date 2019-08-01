package com.assignment.service.converter;

import com.assignment.dto.WeatherResponse;
import com.assignment.entity.WeatherEntity;
import com.assignment.openweatherapi.OpenWeatherResponse;

public abstract class WeatherConverter {

	public static WeatherResponse mapToWeatherResponse(WeatherEntity wEntity) {
		WeatherResponse response = new WeatherResponse(wEntity.getCity(), wEntity.getCountry(), wEntity.getTemperature());
		return response;
	}

	public static WeatherEntity mapToEntity(OpenWeatherResponse openWeatherResponse) {
		WeatherEntity entity = new WeatherEntity();
		entity.setCity(openWeatherResponse.getName());
		entity.setCountry(openWeatherResponse.getSys().getCountry());
		entity.setTemperature(openWeatherResponse.getMain().getTemp());
		return entity;
	}
}
