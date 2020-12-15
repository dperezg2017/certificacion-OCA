package com.certificacion;

import com.certificacion.entity.Persona;
import com.certificacion.service.PersonaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@SpringBootTest
class CertificacionApplicationTests {


	private PersonaService personaService;

	@Test
	public void predicate_test(){
		Persona persona1 = new Persona("Deyviz","Perez",27);
		Persona persona2 = new Persona("Lesly","Bartolo",26);
		Persona persona3 = new Persona("Bosh","Bochito",7);

		List<Persona> personas = new ArrayList<>();
		personas.add(persona1);
		personas.add(persona2);
		personas.add(persona3);

		Predicate<List<Persona>> predicate = personasP -> {
			for(Persona persona:personasP){
				if(persona.getNombre().length()>5){
					System.out.print(persona);
					return true;
				}
			}
			return false;
		};

		if(predicate.test(personas)){
			System.out.print(persona1);
		}

	}

}
