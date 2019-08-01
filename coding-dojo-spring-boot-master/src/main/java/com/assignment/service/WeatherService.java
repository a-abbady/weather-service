package com.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.assignment.dto.WeatherResponse;
import com.assignment.entity.WeatherEntity;
import com.assignment.openweatherapi.OpenWeatherResponse;
import com.assignment.repo.WeatherRepository;
import com.assignment.service.converter.WeatherConverter;
import com.assignment.utils.IConstants;

@Service
public class WeatherService {
	
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WeatherRepository weatherRepository;
    
    
    public WeatherResponse getWeatherData(String city) {
    
    String url = IConstants.WEATHER_API_URL.replace("{city}", city).replace("{appid}", IConstants.APP_ID);
    ResponseEntity<OpenWeatherResponse> response = restTemplate.getForEntity(url, OpenWeatherResponse.class);
    WeatherEntity entity = WeatherConverter.mapToEntity(response.getBody());
    entity = weatherRepository.save(entity);
    return WeatherConverter.mapToWeatherResponse(entity);
}

}
