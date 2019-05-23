package com.xyinc.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyinc.api.models.Poi;
import com.xyinc.api.repository.PoiRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API XY Inc.")
@CrossOrigin(origins="*")
public class PoiController {

	@Autowired
	private PoiRepository poiRepository;
	
	@GetMapping("/pois")
	@ApiOperation(value="Serviço para listar POIs por proximidade.")
	public List<Poi> listarPois() {
		return poiRepository.findAll();
	}
	
	@GetMapping("/pois/{x}/{y}")
	@ApiOperation(value="Serviço para listar todos os POIs cadastrados.")
	public List<Poi> listarPoisPorProximidade(@PathVariable(value="x") int coordX, @PathVariable(value="y") int coordY) {
		return poiRepository.listarPoisPorProximidade(coordX, coordY);
 	}
	
	@PostMapping("/poi")
	@ApiOperation(value="Serviço para cadastrar pontos de interesse.")
	public String cadastrarPoi(@RequestBody Poi poi) {
		int poiSalvo = poiRepository.savePoi(poi);
		if (poiSalvo == 0) {
			return "Coordenada não pode ser negativa!";
		}
		else {
			poiRepository.save(poi);
			return "Poi cadastrado com sucesso!";
		}
	}
	
}
