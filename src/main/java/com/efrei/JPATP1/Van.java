package com.efrei.JPATP1;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collection;

@Entity
public class Van extends Vehicule{


    public Van(String plateNumber, Long id, Collection<Rent> rents, int maxWeight, Long id1) {
        super(plateNumber, id, rents);
        this.maxWeight = maxWeight;
        this.id = id1;
    }
    
    private float maxWeight ;
    public float getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }
   
    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }
    public void setId(Long id ){
        this.id = id;
    }
}
