package com.example.pokemonapi.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;
import java.util.Set;

@Entity
public class Pokemon {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int pokemon_id;
	private int hp;
	private int cp;
	private String name;
	private String picture;
	@ManyToMany()
	@JoinTable(
			name = "type_pokemons",
			joinColumns = @JoinColumn(name = "pokemon_id"),
			inverseJoinColumns = @JoinColumn(name = "type_id"))
	private Set<Type> types;

	/**
	 * Getter de la propriété pokemon_id.
	 *
	 * @return pokemon_id
	 */
	public int getPokemon_id() {
		return pokemon_id;
	}

	/**
	 * Setter de la propriété pokemon_id.
	 *
	 * @param newPokemon_id the pokemon_id to set
	 */
	public void setPokemon_id(final int newPokemon_id) {
		pokemon_id = newPokemon_id;
	}

	/**
	 * Getter de la propriété hp.
	 *
	 * @return hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * Setter de la propriété hp.
	 *
	 * @param newHp the hp to set
	 */
	public void setHp(final int newHp) {
		hp = newHp;
	}

	/**
	 * Getter de la propriété cp.
	 *
	 * @return cp
	 */
	public int getCp() {
		return cp;
	}

	/**
	 * Setter de la propriété cp.
	 *
	 * @param newCp the cp to set
	 */
	public void setCp(final int newCp) {
		cp = newCp;
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
	 * Getter de la propriété picture.
	 *
	 * @return picture
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * Setter de la propriété picture.
	 *
	 * @param newPicture the picture to set
	 */
	public void setPicture(final String newPicture) {
		picture = newPicture;
	}

	/**
	 * Getter de la propriété types.
	 *
	 * @return types
	 */
	public Set<Type> getTypes() {
		return types;
	}

	/**
	 * Setter de la propriété types.
	 *
	 * @param newTypes the types to set
	 */
	public void setTypes(final Set<Type> newTypes) {
		types = newTypes;
	}


}
