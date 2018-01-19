package com.github.aklin.inventive.domain.concrete.inventory;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.aklin.inventive.services.TypeEntryServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class ItemEntryDeserializer extends StdDeserializer<ItemEntry> {

	private long id;
	private long typeid;
	private String name;
	private String description;

	public ItemEntryDeserializer() {
		this(null);
	}

	public ItemEntryDeserializer(Class<?> c) {
		super(c);
	}

	@Override
	public ItemEntry deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
		return null;
	}


	@Autowired
	public void setTypeService(TypeEntryServiceInterface typeService) {

	}
}
