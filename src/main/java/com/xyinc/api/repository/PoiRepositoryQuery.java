package com.xyinc.api.repository;

import java.util.List;

import com.xyinc.api.models.Poi;

public interface PoiRepositoryQuery {

	public int savePoi(Poi poi);
	public List<Poi> listarPoisPorProximidade(int coordX, int coordY);
	
}
