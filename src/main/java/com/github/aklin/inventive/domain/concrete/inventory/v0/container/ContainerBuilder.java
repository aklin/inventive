package com.github.aklin.inventive.domain.concrete.inventory.v0.container;

import com.github.aklin.inventive.domain.inv.ContainerBuilderInterface;
import com.github.aklin.inventive.domain.inv.ContainerInterface;
import com.github.aklin.inventive.domain.inv.TypeInterface;
import com.github.aklin.inventive.services.ContainerServiceInterface;
import com.github.aklin.inventive.services.TypeEntryServiceInterface;
import com.google.common.base.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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
		this.id = id < 0 ? 0 : id;
		return this;
	}

	@Override
	public ContainerBuilder setName(String name) {
		this.name = Strings.nullToEmpty(name).trim();
		return this;
	}

	@Override
	public ContainerBuilder setDescription(String description) {
		this.description = Strings.nullToEmpty(description).trim();
		return this;
	}

	@Override
	public ContainerBuilder setType(long typeID) {
		this.typeID = typeID < 0 ? 0 : typeID;
		return this;
	}

	@Override
	public ContainerBuilder setParent(long parentID) {
		this.parentID = parentID < 0 ? 0 : parentID;
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
