package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {
	
	//Estado
	private Contact contact;
	
	//Escenarios
	public void setupStage1() {
		contact = null;
	}
	
	
	//Casos de prueba
	@Test
	void createNewContact() {
		//Poner el escenario
		setupStage1();
		contact = new Contact("Andrés Andrade", "aandrade@icesi.edu.co", "3019876543");
		
		//Asserts
		assertNotNull(contact);
		assertEquals("Andrés Andrade", contact.getName());
		assertEquals("aandrade@icesi.edu.co", contact.getEmail());
		assertEquals("3019876543", contact.getPhone());
		
		int a = 10;
		
		
		assertTrue(a<20);
		
	}

}
