package com.github.aklin.inventive;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.github.aklin.inventive.domain.concrete.inventory.v0.container.ContainerBuilder;
import com.github.aklin.inventive.domain.concrete.inventory.v0.container.SimpleContainerDeserializer;
import com.github.aklin.inventive.domain.inv.ContainerBuilderInterface;
import com.github.aklin.inventive.domain.inv.ContainerInterface;
import com.github.aklin.inventive.services.ContainerService;
import com.github.aklin.inventive.services.ContainerServiceInterface;
import com.github.aklin.inventive.services.TypeEntryService;
import com.github.aklin.inventive.services.TypeEntryServiceInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public JsonDeserializer<ContainerInterface> getContainerDeserializer() {
		return new SimpleContainerDeserializer();
	}

	@Bean
	public ContainerBuilderInterface getContainerBuilder() {
		return new ContainerBuilder(getContainerServiceInterface(), getTypeServiceInterface());
	}


	@Bean
	public ContainerServiceInterface getContainerServiceInterface() {
		return new ContainerService();
	}


	@Bean
	public TypeEntryServiceInterface getTypeServiceInterface() {
		return new TypeEntryService();
	}
}
