package com.github.aklin.inventive.services;

import com.github.aklin.inventive.domain.inv.TypeInterface;

import java.util.List;

public interface TypeEntryServiceInterface {

	public List<TypeInterface> listAll();

	public TypeInterface get(long id);
}
