package com.example.pokemonapi.controllers;

import com.example.pokemonapi.entities.Pokemon;
import com.example.pokemonapi.entities.Type;
import com.example.pokemonapi.repositories.PokemonRepository;
import com.example.pokemonapi.repositories.TypeRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping(value = "/types")
public class TypeRestController {

	private final TypeRepository repository;

	public TypeRestController(final TypeRepository repository){
		this.repository = repository;
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value = "")
	public List<Type> getPokemonsTypes(){
		return repository.findAll();
	}

	@GetMapping(value = "{id}")
	public Type getPokemonTypeById(@PathVariable("id") int id){
		return repository.findById(id).get();
	}

	@PostMapping(value = "")
	public Type createPokemonType(@RequestBody Type pokemonType) { return repository.save(pokemonType); }

	@PutMapping(value = "")
	public Type updatePokemonType(@RequestBody Type pokemonType) { return repository.save(pokemonType); }

	@DeleteMapping(value = "{id}")
	public void deletePokemonType(@PathVariable("id") int id) { repository.deleteById(id);}

}
