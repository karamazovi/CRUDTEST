package com.jmp.users.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmp.users.interfaceService.IapartmentService;
import com.jmp.users.interfaces.IApartment;
import com.jmp.users.modelo.Apartment;

@Service
public class ApartmentService implements IapartmentService{
	
	@Autowired
	private IApartment data;

	@Override
	public List<Apartment> listar() {
		return (List<Apartment>) data.findAll();
	}

	@Override
	public Optional<Apartment> ListarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Apartment p) {
		int res=0;
		Apartment apartment = data.save(p);
		if(!apartment.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

}
