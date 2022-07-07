package com.greatlearning.library.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Builder;

@Builder
@Entity
public class Library {

	@Id
	private long id;
	private String name;
	private String commaSeparatedBooksNames;
	
	public Library() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCommaSeparatedBooksNames() {
		return commaSeparatedBooksNames;
	}

	public void setCommaSeparatedBooksNames(String commaSeparatedBooksNames) {
		this.commaSeparatedBooksNames = commaSeparatedBooksNames;
	}

	public Library(long id, String name, String commaSeparatedBooksNames) {
		super();
		this.id = id;
		this.name = name;
		this.commaSeparatedBooksNames = commaSeparatedBooksNames;
	}
	
}
