package com.jmp.users.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmp.users.modelo.Apartment;

@Repository
public interface IApartment extends CrudRepository<Apartment, Integer>{

}
