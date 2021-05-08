package ro.ase.cts.command.clase;

public class ComandaConstituire extends ComandaAbstracta {

	public ComandaConstituire(ContBancar contBancar, float suma) {
		super(contBancar, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		super.contBancar.constituire(super.suma);
	}

}
