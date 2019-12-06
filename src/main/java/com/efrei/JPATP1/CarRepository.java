package com.efrei.JPATP1;

import java.util.Optional;
//import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
	
	Optional<Car> findById(Long id);

}
