package com.efrei.JPATP1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiculeWebService {

	VehiculeRepository vehiculeRepository;

	@Autowired
	public VehiculeWebService(VehiculeRepository vehiculeRepository) {
		super();
		this.vehiculeRepository = vehiculeRepository;
	}
	
	@GetMapping("/vehicules")
	public Iterable<Vehicule> getVehicules(){
		return vehiculeRepository.findAll();
	}

	
}
