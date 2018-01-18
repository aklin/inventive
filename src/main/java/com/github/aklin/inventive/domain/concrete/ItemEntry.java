package com.github.aklin.inventive.domain.concrete;

import com.github.aklin.inventive.domain.InventoryEntry;

public class ItemEntry implements InventoryEntry {
	private final long id;
	private final String name;
	private final String description;

	public ItemEntry(long id, String name, String description) {

		if (id < 1) {
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
	public String toString(){
		return "ID: "+id+", Name: "+name+", Description: "+description;
	}
}
