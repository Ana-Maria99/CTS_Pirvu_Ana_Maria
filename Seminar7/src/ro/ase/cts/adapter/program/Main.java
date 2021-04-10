package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdapterCredit;
import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;

public class Main {
	
	public static void creeazaCredit(CreditAbstract credit) {
		credit.oferaCredit();
	}
	
	public static void main(String[] args) {
		Leasing leasing=new Leasing("Ana", 50000);
	
		AdapterCredit adapter=new AdapterCredit(leasing);
		creeazaCredit(adapter);
	
	}

}
