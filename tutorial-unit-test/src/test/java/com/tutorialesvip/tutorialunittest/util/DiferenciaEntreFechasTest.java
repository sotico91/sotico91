package com.tutorialesvip.tutorialunittest.util;

import java.time.Period;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class DiferenciaEntreFechasTest {

	@Autowired
	protected DiferenciaEntreFechas diferenciaFechas;

	@Test
	void testCalculateYearsOfIndependency() {

		diferenciaFechas = new DiferenciaEntreFechas();

		String fechaIndependencia = "27/02/1844";

		Period resultado = diferenciaFechas.calculateYearsOfIndependency(fechaIndependencia);

		Assertions.assertEquals(1, resultado.getMonths());
		Assertions.assertEquals(18, resultado.getDays());
		Assertions.assertEquals(177, resultado.getYears());

	}

}
