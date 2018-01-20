package com.github.aklin.inventive.controllers.api.v0;

import com.github.aklin.inventive.domain.ContainerInterface;
import com.github.aklin.inventive.services.ContainerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v0")
public class ContainerAPIController {

	private final ContainerServiceInterface containerService;

	@Autowired
	public ContainerAPIController(ContainerServiceInterface containerService) {
		this.containerService = containerService;
	}

	@RequestMapping("/containers")
	public List<ContainerInterface> listAll() {
		return containerService.listAll();
	}
}
