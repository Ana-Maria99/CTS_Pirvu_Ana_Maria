package ro.ase.cts.reader;


import java.io.FileNotFoundException;

import java.util.List;


import ro.ase.cts.clase.Aplicant;

public interface ReaderAplicant {
	List<Aplicant> readAplicants(String file) throws FileNotFoundException;
		

}