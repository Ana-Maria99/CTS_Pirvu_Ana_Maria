package ro.ase.cts.simplefactory;

public class Portar extends Jucator {

	public Portar(String numeJucator, int varsta) {
		super(numeJucator, varsta);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Portar []");
		builder.append(super.toString());
		return builder.toString();
	}
	
	
}
