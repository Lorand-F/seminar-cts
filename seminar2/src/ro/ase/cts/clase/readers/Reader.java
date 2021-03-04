package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class Reader {
	
	protected String filename;

	public Reader(String filename) {
		super();
		this.filename = filename;
	}

	public abstract List<Aplicant> readAplicants()throws FileNotFoundException,NumberFormatException;
}
