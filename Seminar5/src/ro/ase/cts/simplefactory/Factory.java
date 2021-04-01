package ro.ase.cts.simplefactory;

public class Factory {
	public Jucator getJucator(TipJucator tipJucator, String numeJucator, int varsta) {
		switch(tipJucator) {
		case PORTAR:
			return new Portar(numeJucator, varsta);
		case FUNDAS:
			return new Fundas(numeJucator, varsta);
		case ATACANT:
			return new Atacant(numeJucator, varsta);
		default:
			throw new IllegalArgumentException();
		}
	}
}
