package com.github.aklin.inventive.services;

import com.github.aklin.inventive.domain.inv.ContainerInterface;

import java.util.List;

public interface ContainerServiceInterface {

	public List<ContainerInterface> listAll();

	public ContainerInterface get(long id);
}
