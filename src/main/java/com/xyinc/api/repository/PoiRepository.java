package com.xyinc.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xyinc.api.models.Poi;

public interface PoiRepository extends JpaRepository<Poi, Long>, PoiRepositoryQuery{
	
}
