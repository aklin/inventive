package com.github.aklin.inventive.domain.concrete.reg;

import com.github.aklin.inventive.domain.reg.SampleInterface;

public class Sample implements SampleInterface {

	private final long id;
	private final String name;
	private final String smiles;
	private final String inchi;

	public Sample(long id, String name, String smiles, String inchi) {
		this.id = id;
		this.name = name;
		this.smiles = smiles;
		this.inchi = inchi;
	}

	@Override
	public long getID() {
		return 0;
	}

	@Override
	public String getName() {
		return null;
	}
}
