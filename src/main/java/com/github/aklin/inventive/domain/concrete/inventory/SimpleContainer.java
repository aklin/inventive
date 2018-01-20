package com.github.aklin.inventive.domain.concrete.inventory;

import com.github.aklin.inventive.domain.ContainerInterface;
import com.github.aklin.inventive.domain.Hierarchical;
import com.github.aklin.inventive.domain.TypeInterface;

public class SimpleContainer implements ContainerInterface {

	private final long id;
	private final String name;
	private final String description;
	private final TypeInterface type;
	private final ContainerInterface parent;

	public SimpleContainer(long id,
	                       String name,
	                       String description,
	                       ContainerInterface parent,
	                       TypeInterface type) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.parent = parent;
		this.type = type;
	}

	@Override
	public long getSlotsTotal() {
		return 0;
	}

	@Override
	public long getSlotsFree() {
		return 0;
	}

	@Override
	public long getSlotsOccupied() {
		return 0;
	}


	@Override
	public String getDescription() {
		return null;
	}

	@Override
	public Hierarchical getParent() {
		return null;
	}

	@Override
	public long getID() {
		return 0;
	}

	@Override
	public String getName() {
		return null;
	}
}
