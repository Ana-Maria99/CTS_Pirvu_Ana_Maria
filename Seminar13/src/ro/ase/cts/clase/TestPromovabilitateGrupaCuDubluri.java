package ro.ase.cts.clase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ro.ase.cts.dubluri.StudentDummy;
import ro.ase.cts.dubluri.StudentFake;
import ro.ase.cts.dubluri.StudentStud;

public class TestPromovabilitateGrupaCuDubluri {
	@Test
	public void testReferenceAdaugaStudent1() {
		Grupa grupa = new Grupa(1070);
		grupa.adaugaStudent(new StudentDummy());
		grupa.adaugaStudent(new StudentDummy());
		assertEquals(2, grupa.getStudenti().size());
	}
	@Test
	public void testReferenceCuStub() {
		Grupa grupa = new Grupa(1064);
		grupa.adaugaStudent(new StudentStud());
		grupa.adaugaStudent(new StudentStud());
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test
	public void testReferenceCuFake() {
		Grupa grupa = new Grupa(1063);
		for(int i=0;i<7;i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestanta(false);
			grupa.adaugaStudent(student);
			
		}
		for(int i=0;i<3;i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestanta(true);
			grupa.adaugaStudent(student);
			
		}
		assertEquals(0.7,grupa.getPromovabilitate(), 0.01);
	}
}
