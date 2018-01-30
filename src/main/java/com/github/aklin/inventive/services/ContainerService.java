package com.github.aklin.inventive.services;

import com.github.aklin.inventive.domain.concrete.inventory.v0.container.SimpleContainer;
import com.github.aklin.inventive.domain.inv.ContainerInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ContainerService implements ContainerServiceInterface {
	private Map<Long, ContainerInterface> entries;

	public ContainerService() {
		entries = new HashMap<>();


		for (long i = 1; i < 15; i++) {
			entries.put(i, new SimpleContainer(i,
					"Container " + i,
					"This is container #" + i,
					null,
					null));
		}

	}

	@Override
	public List<ContainerInterface> listAll() {
		return new ArrayList<>(entries.values());
	}

	@Override
	public ContainerInterface get(long id) {
		return entries.get(id);
	}
}
