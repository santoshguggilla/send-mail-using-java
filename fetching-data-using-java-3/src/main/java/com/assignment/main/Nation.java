package com.assignment.main;

public class Nation {
	
	private Country[] countries;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country[] getCountries() {
		return countries;
	}

	public void setCountries(Country[] countries) {
		this.countries = countries;
	} 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
