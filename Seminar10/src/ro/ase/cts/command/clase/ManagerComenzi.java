package ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
	private List<ComandaAbstracta> listaComenzi;

	public ManagerComenzi(List<ComandaAbstracta> listaComenzi) {
		super();
		this.listaComenzi = new ArrayList<ComandaAbstracta>();
	}
	
	public ManagerComenzi() {
		// TODO Auto-generated constructor stub
	}

	public void invocaComanda(ComandaAbstracta comanda) {
		listaComenzi.add(comanda);
	}
	
	public void executaComanda() {
		if(listaComenzi.size()>0) {
			listaComenzi.get(0).executa();
			listaComenzi.remove(0);
		}
	}

	
}
