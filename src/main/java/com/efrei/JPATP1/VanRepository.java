package com.efrei.JPATP1;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface VanRepository extends CrudRepository<Van, Long> {

	Optional<Van> findById(Long id);

}
