package ro.ase.cts.state.clase;

public class Masa {
	private int idMasa;
	private StareMasa stareMasa;
	
	
	
	public Masa(int idMasa) {
		super();
		this.idMasa = idMasa;
		this.stareMasa = new Libera();
	}



	public StareMasa getStareMasa() {
		return stareMasa;
	}



	public void setStareMasa(StareMasa stareMasa) {
		this.stareMasa = stareMasa;
	}
	
	public void rezervareMasa(String numeClient) {
		if(this.getStareMasa() instanceof Libera) {
			System.out.println(numeClient+ " a rezervat masa");
			this.setStareMasa(new Rezervata());
		}
		else {
			System.out.println("Nu e libera");
		}
	}
	
	public void ocupaMasa(String numeClient) {
		if(!(this.getStareMasa() instanceof Ocupata)) {
			System.out.println(numeClient+ " a ocupat masa");
			this.setStareMasa(new Ocupata());
		}else {
			System.out.println("Nu poate fi ocupata");
		}
	}
	
	public void elibereazaMasa(String numeClient) {
		if(!(this.getStareMasa() instanceof Libera)) {
			System.out.println(numeClient+ " a eliberat masa");
			this.setStareMasa(new Rezervata());
		}else {
			System.out.println("E libera");
		}
	}
	
}
