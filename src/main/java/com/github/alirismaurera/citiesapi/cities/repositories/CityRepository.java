package com.github.alirismaurera.citiesapi.cities.repositories;

import com.github.alirismaurera.citiesapi.cities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CityRepository extends JpaRepository<City, Long> {



}

