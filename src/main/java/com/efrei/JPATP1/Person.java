package com.efrei.JPATP1;


import javax.persistence.*;

//import com.efrei.JPATP1.*;

import java.util.Collection;

@Entity
public class Person {
	
	
	public Person(String name, Long id, Collection<Rent> rents) {
		this.name = name;
		this.id = id;
		this.rents = rents;
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
	
	private String name ;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

	private Collection<Rent> rents;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="person")
	public Collection<Rent> getRents() {
		return rents;
	}
	public void setRents(Collection<Rent> rents) {
		this.rents = rents;
	}
	public void addRent( Rent rent ){
		this. getRents().add( rent );
		rent.person = this;}


}
