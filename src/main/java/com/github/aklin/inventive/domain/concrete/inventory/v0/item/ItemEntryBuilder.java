package com.github.aklin.inventive.domain.concrete.inventory.v0.item;

import com.github.aklin.inventive.domain.inv.InventoryEntry;
import com.github.aklin.inventive.domain.inv.ItemBuilderInterface;
import com.google.common.base.Strings;

public class ItemEntryBuilder implements ItemBuilderInterface {

	private long id;
	private long typeID;
	private long containerID;
	private String name;
	private String description;


	@Override
	public ItemBuilderInterface setID(long id) {
		this.id = id < 0 ? 0 : id;
		return this;
	}

	@Override
	public ItemBuilderInterface setName(String name) {
		this.name = Strings.nullToEmpty(name).trim();
		return this;
	}

	@Override
	public ItemBuilderInterface setDescription(String description) {
		this.description = Strings.nullToEmpty(description).trim();
		return this;
	}

	@Override
	public ItemBuilderInterface setType(long typeID) {
		this.typeID = typeID < 0 ? 0 : typeID;
		return this;
	}

	@Override
	public ItemBuilderInterface setContainer(long containerID) {
		this.containerID = containerID < 0 ? 0 : containerID;
		return this;
	}

	@Override
	public InventoryEntry create() {
		return new ItemEntry(id, name, description);
	}
}
