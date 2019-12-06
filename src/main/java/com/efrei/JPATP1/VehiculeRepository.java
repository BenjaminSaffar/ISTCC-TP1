package com.efrei.JPATP1;



import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {

	Optional<Vehicule> findById(Long id);


}
