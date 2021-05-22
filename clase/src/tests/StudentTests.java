package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Test
	public void testCorectitudineConstructorCuParam() {
		//fail("Not yet implemented");
		String nume="Gigel";
		Student student=new Student(nume);
		assertEquals(nume, student.getNume());
		
	}
	
	@Test
	public void testInitializareListaInConstructor() {
		Student student=new Student("Gigel");
		assertNotNull(student.getNote());
	}
	
	@Test
	public void testCorectitudineConstructorDefault() {
		Student student=new Student();
		assertNotNull("numele nu a fost initializat", student.getNume());
		assertNotNull("lista nu a fost initializata", student.getNote());
	}
	
	@Test
	public void testMetodaAdaugareNotaInLista() {
		//fail("Not yet implemented");
		
		Student student=new Student();
		int nota=10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
		
	}

}
