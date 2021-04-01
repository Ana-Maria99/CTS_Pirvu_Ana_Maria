package ro.ase.cts.simplefactory;

public class Atacant extends Jucator{

	public Atacant(String numeJucator, int varsta) {
		super(numeJucator, varsta);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atacant []");
		builder.append(super.toString());
		return builder.toString();
	}
}
