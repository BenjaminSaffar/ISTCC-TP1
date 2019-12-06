package com.efrei.JPATP1;


import java.util.List;


import org.springframework.data.repository.CrudRepository;


public interface RentRepository extends CrudRepository<Rent, Long> {

    List<Rent> findByBeginRent(String beginRent);

}
