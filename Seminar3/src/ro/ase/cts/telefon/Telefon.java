package ro.ase.cts.telefon;

public class Telefon {
	private int serie;
	private String model;
	private float pret;
	
	private static Telefon telefon=null;
	
	private Telefon(int serie, String model, float pret) {
		this.serie = serie;
		this.model = model;
		this.pret = pret;
	}
	
	public static synchronized Telefon getInstance(int serie, String model, float pret) {
		if(telefon==null) {
			telefon=new Telefon(serie, model, pret);
		}
		return telefon;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPret(float pret) {
		this.pret = pret;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Telefon [serie=");
		builder.append(serie);
		builder.append(", model=");
		builder.append(model);
		builder.append(", pret=");
		builder.append(pret);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
