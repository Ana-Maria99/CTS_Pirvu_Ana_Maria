package ro.ase.cts.factorymethod;

public class Atacant extends Jucator {

	public Atacant(String nume, int meciuriJucate) {
		super(nume, meciuriJucate);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atacant []");
		builder.append(super.toString());
		return builder.toString();
	}
}
