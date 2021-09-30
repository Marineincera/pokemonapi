package com.example.pokemonapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "pokemons"})
@Entity
public class Type {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int type_id;
	private String name;
	@ManyToMany(mappedBy = "types")
	Set<Pokemon> pokemons;

	/**
	 * Getter de la propriété type_id.
	 *
	 * @return type_id
	 */
	public int getType_id() {
		return type_id;
	}

	/**
	 * Setter de la propriété type_id.
	 *
	 * @param newType_id the type_id to set
	 */
	public void setType_id(final int newType_id) {
		type_id = newType_id;
	}


	/**
	 * Getter de la propriété name.
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter de la propriété name.
	 *
	 * @param newName the name to set
	 */
	public void setName(final String newName) {
		name = newName;
	}

	/**
	 * Getter de la propriété pokemons.
	 *
	 * @return pokemons
	 */
	public Set<Pokemon> getPokemons() {
		return pokemons;
	}

	/**
	 * Setter de la propriété pokemons.
	 *
	 * @param newPokemons the pokemons to set
	 */
	public void setPokemons(final Set<Pokemon> newPokemons) {
		pokemons = newPokemons;
	}

}
