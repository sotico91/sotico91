package com.tutorialesvip.tutorialunittest.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Country {
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "country_id")
	private Long countryId;

	@Getter
	@Setter
	@Column(name = "iso_code")
	private String isoCode;

	@Getter
	@Setter
	@Column(name = "country_name")
	private String countryName;

	@Getter
	@Setter
	@Column(name = "country_capital")
	private String countryCapital;

	@Getter
	@Setter
	@Column(name = "country_independence_date")
	private String countryIdependenceDate;

}
