package com.xyinc.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xyinc.api.models.Poi;

public class PoiRepositoryImpl implements PoiRepositoryQuery{
	
	private final int distanciaMaxima = 10;
	
	@Autowired
	private PoiRepository poiRepository;
	
	private List<Poi> pois = new ArrayList<Poi>();

	public int savePoi(Poi poi) {
		if (poi.getCoordX() < 0 || poi.getCoordY() < 0) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	public List<Poi> listarPoisPorProximidade(int coordX, int coordY) {
		List<Poi> listaPois = poiRepository.findAll();
		for (Poi poi : listaPois) {
			int x = (int) Math.pow((poi.getCoordX() - coordX), 2);
			int y = (int) Math.pow((poi.getCoordY() - coordY), 2);
			int soma = x + y;
			int distancia = (int) Math.sqrt(soma);
			if (distancia <= distanciaMaxima) {
				pois.add(poi);
			}
		}
		return pois;
	}
}
