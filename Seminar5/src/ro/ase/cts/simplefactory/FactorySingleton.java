package ro.ase.cts.simplefactory;

public class FactorySingleton {
	
	private static FactorySingleton factorySingleton=null;
	
	private FactorySingleton() {
		
	}
	
	public static synchronized FactorySingleton getInstance() {
		if(factorySingleton==null) {
			factorySingleton=new FactorySingleton();
		}
		return factorySingleton;
	}

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
