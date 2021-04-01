package ro.ase.cts.simplefactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Factory factory=new Factory();
		Jucator portar=factory.getJucator(TipJucator.PORTAR, "Alin", 20);
		Jucator fundas=factory.getJucator(TipJucator.FUNDAS, "David", 30);
		System.out.println(portar.toString());
		System.out.println(fundas.toString());*/
		
		
		FactorySingleton factorySingleton=FactorySingleton.getInstance();
		Jucator portar=factorySingleton.getJucator(TipJucator.PORTAR, "Alin", 20);
		Jucator fundas=factorySingleton.getJucator(TipJucator.FUNDAS, "David", 30);
		System.out.println(portar.toString());
		System.out.println(fundas.toString());
	}

}
