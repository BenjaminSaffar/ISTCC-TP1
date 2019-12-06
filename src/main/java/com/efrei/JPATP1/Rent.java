package com.efrei.JPATP1;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Rent {
   
    public Rent(Date beginRent, Date endRent, Long id, Vehicule vehicule, Person person) {
        this.beginRent = beginRent;
        this.endRent = endRent;
        this.id = id;
        this.vehicule = vehicule;
        this.person = person;
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
    
    private Date beginRent;
    public Date getBeginRent() {
        return beginRent;
    }
    
    
    public void setBeginRent(Date beginRent) {
        this.beginRent = beginRent;
    }
    
    private Date endRent;
    public Date getEndRent() {
        return endRent;
    }

    public void setEndRent(Date endRent) {
        this.endRent = endRent;
    }
    
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
  //one to many bidirectional association with cascade
   
    Vehicule vehicule;
    @ManyToOne
    public Vehicule getVehicule() {
        return vehicule;
    }
    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }
    
    //one to many bidirectional association with cascade
   
    Person person;
    @ManyToOne
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }


}
