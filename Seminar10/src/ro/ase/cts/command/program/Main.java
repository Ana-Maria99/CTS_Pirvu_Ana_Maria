package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandaConstituire;
import ro.ase.cts.command.clase.ComandaDepunere;
import ro.ase.cts.command.clase.ComandaRetragere;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerComenzi managerComenzi=new ManagerComenzi();
		ContBancar contBancar=new ContBancar("Ana");
		managerComenzi.invocaComanda(new ComandaConstituire(contBancar, 100));
		managerComenzi.invocaComanda(new ComandaDepunere(contBancar, 80));
		managerComenzi.executaComanda();
		managerComenzi.invocaComanda(new ComandaRetragere(contBancar, 20));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.invocaComanda(new ComandaRetragere(contBancar, 180));
		managerComenzi.executaComanda();
	}

}
