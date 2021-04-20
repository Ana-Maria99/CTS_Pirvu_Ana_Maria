package ro.ase.cts.proxy.clase;

public class OperatorRezervare implements IOperatorRezervari{

	private String numeRestaurant;
	
	
	public OperatorRezervare(String numeRestaurant) {
		super();
		this.numeRestaurant = numeRestaurant;
	}


	@Override
	public void rezerva(int numarPersoane) {
		// TODO Auto-generated method stub
		System.out.println("Rezervare la "+numeRestaurant+" pentru "+ numarPersoane);
	}
	
;
}
