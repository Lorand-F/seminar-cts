package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;
import ro.ase.cts.clase.UniversalReader;
import ro.ase.cts.clase.readers.EmployeeReader;
import ro.ase.cts.clase.readers.PupilReader;
import ro.ase.cts.clase.readers.Reader;
import ro.ase.cts.clase.readers.StudentReader;

public class Program {
	
	public static List<Aplicant> readAplicants(Reader reader) throws FileNotFoundException{
		return reader.readAplicants();
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		System.out.println("Suma finantata Student: "+Student.getSumaFinantata());
		System.out.println("Suma finantata Angajat: "+Angajat.getSumaFinantata());
		try {
			listaAplicanti = UniversalReader.readAplicants(new EmployeeReader("angajati.txt"));	
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
				aplicant.afiseazaSumaFinantare();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
