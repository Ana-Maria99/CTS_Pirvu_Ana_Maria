package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaClienti;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1=new Rezervare(1, 2, 3);
		Rezervare rezervare2=new Rezervare(4, 5, 6);
		Rezervare rezervare3=new Rezervare(7, 8, 9);

	FabricaClienti fabrica=new FabricaClienti();
	Client client1=fabrica.getClient("client@cts.com");
	client1.printeazaRezervare(rezervare1);
	fabrica.getClient("client2@cts.com").printeazaRezervare(rezervare2);
	
	fabrica.getClient("client@cts.com").printeazaRezervare(rezervare3);
	}

}
