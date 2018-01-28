package com.github.aklin.inventive.domain.concrete.inventory.v0.container;

import com.github.aklin.inventive.domain.inv.ContainerBuilderInterface;
import com.github.aklin.inventive.domain.inv.ContainerInterface;
import com.github.aklin.inventive.domain.inv.TypeInterface;
import com.github.aklin.inventive.services.ContainerServiceInterface;
import com.github.aklin.inventive.services.TypeEntryServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class ContainerBuilder implements ContainerBuilderInterface {

	private long id;
	private long typeID;
	private long parentID;
	private String name;
	private String description;

	private final ContainerServiceInterface containerService;
	private final TypeEntryServiceInterface typeService;

	@Autowired
	public ContainerBuilder(ContainerServiceInterface cs, TypeEntryServiceInterface ts) {
		containerService = cs;
		typeService = ts;
	}

	@Override
	public ContainerBuilder setID(long id) {
		this.id = id;
		return this;
	}

	@Override
	public ContainerBuilder setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public ContainerBuilder setDescription(String description) {
		this.description = description;
		return this;
	}

	@Override
	public ContainerBuilder setType(long typeID) {
		this.typeID = typeID;
		return this;
	}

	@Override
	public ContainerBuilder setParent(long parentID) {
		this.parentID = parentID;
		return this;
	}

	@Override
	public ContainerInterface create() {

		final ContainerInterface parent;
		final TypeInterface type;

		parent = containerService.get(parentID);
		type = typeService.get(typeID);

		return new SimpleContainer(id, name, description, parent, type);
	}
}
