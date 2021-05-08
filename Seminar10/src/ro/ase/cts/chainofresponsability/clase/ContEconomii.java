package ro.ase.cts.chainofresponsability.clase;

public class ContEconomii extends Cont{

	public ContEconomii(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		// TODO Auto-generated method stub
		if(suma<super.getSold()) {
			System.out.println("Se face plata din contul de economii pentru suma de "+suma);
			super.setSold(super.getSold()-suma);
		}else if(super.getCont()!=null){
			super.getCont().realizeazaPlata(suma);
			
		}else {
			System.out.println("Tranzactie refuzata!");
		}
	}
	
}
