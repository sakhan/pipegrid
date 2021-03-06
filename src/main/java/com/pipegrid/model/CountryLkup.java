package com.pipegrid.model;

// Generated Aug 24, 2012 4:44:03 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * CountryLkup generated by hbm2java
 */
public class CountryLkup implements java.io.Serializable {

	private short countryId;
	private String name;
	private Set<Item> items = new HashSet<Item>(0);
	private Set<Company> companies = new HashSet<Company>(0);

	public CountryLkup() {
	}

	public CountryLkup(short countryId, String name) {
		this.countryId = countryId;
		this.name = name;
	}

	public CountryLkup(short countryId, String name, Set<Item> items,
			Set<Company> companies) {
		this.countryId = countryId;
		this.name = name;
		this.items = items;
		this.companies = companies;
	}

	public short getCountryId() {
		return this.countryId;
	}

	public void setCountryId(short countryId) {
		this.countryId = countryId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Item> getItems() {
		return this.items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public Set<Company> getCompanies() {
		return this.companies;
	}

	public void setCompanies(Set<Company> companies) {
		this.companies = companies;
	}

}
