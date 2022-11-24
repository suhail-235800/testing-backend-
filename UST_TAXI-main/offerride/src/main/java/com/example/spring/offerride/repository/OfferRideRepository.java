package com.example.spring.offerride.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.offerride.model.OfferRide;

@Repository
public interface OfferRideRepository extends JpaRepository<OfferRide,Integer> {

	

	List<OfferRide> findAllByStart(String start_point);
	
}
