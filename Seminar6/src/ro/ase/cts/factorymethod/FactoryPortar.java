package ro.ase.cts.factorymethod;

public class FactoryPortar implements AbstractFactory{

	public Jucator getJucator(String nume, int meciuriJucate) {
		return new Portar(nume, meciuriJucate);
	}
}
