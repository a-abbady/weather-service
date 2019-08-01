package com.assignment.repo;

import org.springframework.data.repository.CrudRepository;

import com.assignment.entity.WeatherEntity;

public interface WeatherRepository extends CrudRepository<WeatherEntity, Integer> {
}
