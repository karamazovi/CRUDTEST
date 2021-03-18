package com.jmp.users.interfaceService;

import java.util.List;
import java.util.Optional;

import com.jmp.users.modelo.Apartment;

public interface IapartmentService {
	public List<Apartment>listar();
	public Optional<Apartment>ListarId(int id);
	public int save(Apartment p);
	public void delete(int id);

}
