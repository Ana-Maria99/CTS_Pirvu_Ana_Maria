package ro.ase.cts.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.clase.TestGetPromovabilitateGrupa;
import ro.ase.cts.clase.TestPromovabilitateGrupaCuDubluri;
import ro.ase.cts.clase.TestPromovabilitateGrupaWithFixture;
import ro.ase.cts.clase.TesteConstructorGrupa;

@RunWith(Suite.class)
@SuiteClasses({TesteConstructorGrupa.class, TestGetPromovabilitateGrupa.class, TestPromovabilitateGrupaCuDubluri.class,
	TestPromovabilitateGrupaWithFixture.class})
public class SuitaCompleta {

}
