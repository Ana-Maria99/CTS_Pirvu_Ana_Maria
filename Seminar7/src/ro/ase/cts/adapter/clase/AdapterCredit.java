package ro.ase.cts.adapter.clase;

public class AdapterCredit implements CreditAbstract{
	private Leasing leasing;

	public AdapterCredit(Leasing leasing) {
		this.leasing=leasing;
		
	}
	
	@Override
	public void oferaCredit() {
		// TODO Auto-generated method stub
		leasing.creeazaLeasing();
	}

}
