package com.github.aklin.inventive.domain.concrete.inventory.v0.item;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.aklin.inventive.domain.core.Locatable;
import com.github.aklin.inventive.domain.inv.ItemInterface;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@JsonClassDescription
@JsonDeserialize(using = ItemEntryDeserializer.class)
@JsonIgnoreProperties("is-root")
public class ItemEntry implements ItemInterface {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long id;
	private final String name;
	private final String description;

	@JsonCreator
	public ItemEntry(@JsonProperty("id") long id, @JsonProperty("name") String name, @JsonProperty("description") String description) {

		if (id < 0) {
			throw new IllegalArgumentException("ID must be greater than 0");
		}


		this.id = id;
		this.name = name;
		this.description = description;

	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public long getID() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Description: " + description;
	}

	@Override
	public Locatable getParent() {
		return null;
	}
}
