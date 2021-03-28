package ro.ase.cts.program;

import ro.ase.cts.singletone.AsigurareMedicala;
import ro.ase.cts.telefon.Telefon;

public class MainClass {

	public static void main(String[] args) {
		AsigurareMedicala asigurareMedicala= AsigurareMedicala.getInstance();
		AsigurareMedicala asigurareMedicala2=AsigurareMedicala.getInstance();
		
		
		asigurareMedicala.setId(3);
		asigurareMedicala.setContributie(400.2f);
		
		System.out.println(asigurareMedicala.toString());
		System.out.println(asigurareMedicala2.toString());
	
		
		ro.ase.cts.singletoneLazy.AsigurareMedicala asigurareLazy1=ro.ase.cts.singletoneLazy.AsigurareMedicala.getInstance(4, "Lau", 120.3f);
		ro.ase.cts.singletoneLazy.AsigurareMedicala asigurareLazy2=ro.ase.cts.singletoneLazy.AsigurareMedicala.getInstance(5, "Raluca", 67.3f);
		
		System.out.println(asigurareLazy1.toString());
		System.out.println(asigurareLazy2.toString());
	
	
		Telefon telefon1=Telefon.getInstance(2452, "IPhone", 3200.5f);
		Telefon telefon2=Telefon.getInstance(5432, "Samsung", 5200.5f);
	
		System.out.println(telefon1.toString());
		System.out.println(telefon2.toString());
	}

}
