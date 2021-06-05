package ro.ase.cts.suite;

import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.clase.TestGetPromovabilitateGrupa;
import ro.ase.cts.clase.TestPromovabilitateGrupaCuDubluri;
import ro.ase.cts.clase.TestPromovabilitateGrupaWithFixture;
import ro.ase.cts.clase.TesteConstructorGrupa;
import ro.ase.cts.suite.categorii.PromovabilitateCategory;
import ro.ase.cts.suite.categorii.UrgentTestCategory;

@RunWith(Suite.class)
@SuiteClasses({ TesteConstructorGrupa.class,TestGetPromovabilitateGrupa.class,TestPromovabilitateGrupaCuDubluri.class,TestPromovabilitateGrupaWithFixture.class })
@IncludeCategory(PromovabilitateCategory.class)
@ExcludeCategory(UrgentTestCategory.class)
public class CustomSuite {

}
