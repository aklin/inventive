package com.github.aklin.inventive.domain;

public interface Describable {
	public default String getDescription(){
		return "";
	}
}
