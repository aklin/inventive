package com.github.aklin.inventive.domain.concrete.inventory.v0.item;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.aklin.inventive.domain.inv.ItemBuilderInterface;
import com.github.aklin.inventive.domain.inv.ItemInterface;
import com.google.common.base.Strings;
import com.google.common.primitives.Longs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ItemEntryDeserializer extends JsonDeserializer<ItemInterface> {

	private ItemBuilderInterface builder;

	@Override
	public ItemInterface deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
		final JsonNode node = jsonParser.getCodec().readTree(jsonParser);

		final JsonNode idNode = node.get("id");
		final JsonNode nameNode = node.get("name");
		final JsonNode descNode = node.get("description");

		return builder.setID(Longs.tryParse(idNode.asText()))
				.setName(Strings.nullToEmpty(nameNode.asText()).trim())
				.setDescription(Strings.nullToEmpty(descNode.asText()).trim())
				.create();
	}


	@Autowired
	public void setBuilder(ItemBuilderInterface builder) {
		this.builder = builder;
	}
}
