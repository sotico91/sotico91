package com.tutorialesvip.tutorialunittest.models;

import lombok.Getter;
import lombok.Setter;

public class CountryResponse {

	@Getter
	@Setter
	private String countryName;
	@Getter
	@Setter
	private String capitalName;
	@Getter
	@Setter
	private String independenceDate;
	@Getter
	@Setter
	private int yearsOfIndependency;
	@Getter
	@Setter
	private int monthsOfIndependency;
	@Getter
	@Setter
	private int dayssOfIndependency;

}