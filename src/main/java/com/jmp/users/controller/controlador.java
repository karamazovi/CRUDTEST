package com.jmp.users.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jmp.users.interfaceService.IapartmentService;
import com.jmp.users.modelo.Apartment;

@Controller
@RequestMapping
public class controlador {

	@Autowired
	private IapartmentService service;

	@GetMapping("/listar")
	public String Listar(Model model) {
		List<Apartment> apartments = service.listar();
		model.addAttribute("apartments", apartments);

		return "index";
	}

	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("apartment", new Apartment());
		return "form";
	}

	@PostMapping("/save")
	public String save(@Validated Apartment p, Model model) {
		service.save(p);
		return "redirect:/listar";
	}

	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Apartment> apartment = service.ListarId(id);
		model.addAttribute("apartment", apartment);
		return "form";
	}

	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}

}
