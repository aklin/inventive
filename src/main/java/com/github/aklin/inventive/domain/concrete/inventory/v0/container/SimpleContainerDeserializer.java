package com.github.aklin.inventive.domain.concrete.inventory.v0.container;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.aklin.inventive.domain.inv.ContainerBuilderInterface;
import com.github.aklin.inventive.domain.inv.ContainerInterface;
import com.google.common.base.Strings;
import com.google.common.primitives.Longs;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;


public class SimpleContainerDeserializer extends JsonDeserializer<ContainerInterface> {

	private ContainerBuilderInterface builder;

	@Autowired
	public void setBuilder(ContainerBuilderInterface builder) {
		this.builder = builder;
	}
/*

	public SimpleContainerDeserializer() {
		this(null);
	}


	public SimpleContainerDeserializer(Class<?> vc) {
		super(vc);
	}
*/


	@Override
	public ContainerInterface deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
		final JsonNode node = jp.getCodec().readTree(jp);

		final JsonNode idNode = node.get("id");
		final JsonNode nameNode = node.get("name");
		final JsonNode descNode = node.get("description");

		return builder.setID(Longs.tryParse(idNode.asText()))
				.setName(Strings.nullToEmpty(nameNode.asText()).trim())
				.setDescription(Strings.nullToEmpty(descNode.asText()).trim())
				.create();
	}
}
