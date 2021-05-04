package com.tutorialesvip.tutorialunittest.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.tutorialesvip.tutorialunittest.models.Country;
import com.tutorialesvip.tutorialunittest.models.CountryResponse;
import com.tutorialesvip.tutorialunittest.repositories.CountryRepository;
import com.tutorialesvip.tutorialunittest.util.DiferenciaEntreFechas;

class IndependencyControllerTest {

	public CountryRepository countryRepositoryMock = Mockito.mock(CountryRepository.class);

	@Autowired
	public DiferenciaEntreFechas diferenciaEntreFechas = new DiferenciaEntreFechas();

	@Autowired
	IndependencyController indController = new IndependencyController(countryRepositoryMock, diferenciaEntreFechas);

	@BeforeEach
	void setUp() throws Exception {

		Country mockCountry = new Country();
		mockCountry.setIsoCode("DO");
		mockCountry.setCountryIdependenceDate("27/02/1844");
		mockCountry.setCountryName("Republica Dominicana");
		mockCountry.setCountryId((long) 1);
		mockCountry.setCountryCapital("Santo Domingo");

		Mockito.when(countryRepositoryMock.findCountryByIsoCode("DO")).thenReturn(mockCountry);
		
	}

	@Test
	void testGetCountryDetailsWithValidCountryCode() {

		ResponseEntity<CountryResponse> respuestaService;

		respuestaService = indController.getCountryDetails("DO");
		Assertions.assertEquals("Republica Dominicana", respuestaService.getBody().getCountryName());

	}

	@Test
	void testGetCountryDetailsWithInValidCountryCode() {

		ResponseEntity<CountryResponse> respuestaService;

		respuestaService = indController.getCountryDetails("CO");
		Assertions.assertNull(respuestaService.getBody());

	}

}
