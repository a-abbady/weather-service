package com.assignment.dto;


public class WeatherResponse {
	
	private String city;
    private String country;
    private Double temperature;
    
    public WeatherResponse() {}
    
    
	public WeatherResponse(String city, String country, Double temperature) {
		super();
		this.city = city;
		this.country = country;
		this.temperature = temperature;
	}


	public void setCity(String city) {
		this.city = city;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public Double getTemperature() {
		return temperature;
	}
    
    
	

}
