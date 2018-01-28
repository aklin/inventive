package com.github.aklin.inventive.controllers.api.v0;

import com.github.aklin.inventive.domain.inv.ContainerInterface;
import com.github.aklin.inventive.services.ContainerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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


	public List<ContainerInterface> listAll(Integer offset, Integer limit) {
		throw new NotImplementedException();
	}


	public ContainerInterface get(Long id) {
		return containerService.get(id);
	}


	@RequestMapping(value = "/containers", method = RequestMethod.PUT)
	public ContainerInterface create(@RequestBody ContainerInterface a) {
		return a;
	}
}
