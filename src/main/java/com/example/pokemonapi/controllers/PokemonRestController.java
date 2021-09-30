package com.example.pokemonapi.controllers;

import com.example.pokemonapi.entities.Pokemon;
import com.example.pokemonapi.repositories.PokemonRepository;
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
@RequestMapping(path = "/pokemons")
public class PokemonRestController {

	private final PokemonRepository repository;

	public PokemonRestController(final PokemonRepository repository){
		this.repository = repository;
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value = "")
	public List<Pokemon> getPokemons(){
		return repository.findAll();
	}

	@GetMapping(value = "{id}")
	public Pokemon getPokemonById(@PathVariable("id") int id){
		return repository.findById(id).get();
	}

	@PostMapping(value = "")
	public Pokemon createPokemon(@RequestBody Pokemon pokemon) { return repository.save(pokemon); }

	@PutMapping(value = "")
	public Pokemon updatePokemon(@RequestBody Pokemon pokemon) { return repository.save(pokemon); }

	@DeleteMapping(value = "{id}")
	public void deletePokemon(@PathVariable("id") int id) { repository.deleteById(id);}


}
