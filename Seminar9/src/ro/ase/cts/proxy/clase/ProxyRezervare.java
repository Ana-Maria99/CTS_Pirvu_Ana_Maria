package ro.ase.cts.proxy.clase;

public class ProxyRezervare implements IOperatorRezervari{

	private OperatorRezervare operatorRezervare;
	private int numarMinPers;
	
	
	
	public ProxyRezervare(OperatorRezervare operatorRezervare, int numarMinPers) {
		super();
		this.operatorRezervare = operatorRezervare;
		this.numarMinPers = numarMinPers;
	}



	@Override
	public void rezerva(int numarPersoane) {
		// TODO Auto-generated method stub
		if(numarPersoane>numarMinPers) {
			operatorRezervare.rezerva(numarPersoane);
		} else {
			System.out.println("Numarul de persoane este prea mic!");
		}
	}

	
}
