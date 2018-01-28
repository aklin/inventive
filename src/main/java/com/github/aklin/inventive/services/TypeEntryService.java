package com.github.aklin.inventive.services;

import com.github.aklin.inventive.domain.concrete.inventory.v0.type.TypeEntry;
import com.github.aklin.inventive.domain.inv.TypeInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TypeEntryService implements TypeEntryServiceInterface {

	private final Map<Long, TypeInterface> types;

	public TypeEntryService() {
		types = new HashMap<>();

		for (long i = 0; i < 15; i++) {
			types.put(i, new TypeEntry(i, null));
		}
	}

	@Override
	public List<TypeInterface> listAll() {
		return new ArrayList<>(types.values());
	}

	@Override
	public TypeInterface get(long id) {
		return types.get(id);
	}

	@Override
	public TypeInterface getDefaultType() {
		return get(0);
	}
}
