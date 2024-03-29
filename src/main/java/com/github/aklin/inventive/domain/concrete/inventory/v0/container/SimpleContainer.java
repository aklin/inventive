package com.github.aklin.inventive.domain.concrete.inventory.v0.container;

import com.github.aklin.inventive.domain.core.Locatable;
import com.github.aklin.inventive.domain.inv.ContainerInterface;
import com.github.aklin.inventive.domain.inv.TypeInterface;

//@JsonDeserialize(using = SimpleContainerDeserializer.class)
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
	public Locatable getParent() {
		return null;
	}
}
