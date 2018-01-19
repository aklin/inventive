package com.github.aklin.inventive.domain;

import com.fasterxml.jackson.annotation.JsonGetter;

public interface Nameable {

	@JsonGetter("name")
	public String getName();
}
