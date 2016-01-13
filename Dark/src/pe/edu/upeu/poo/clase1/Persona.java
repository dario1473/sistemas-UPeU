package pe.edu.upeu.poo.clase1;

import java.util.Date;

public class Persona {
	Double haltura;
	String Nonmbre;
	String ApellidoPaterno;
	String ApellidMaterno;
	String Celular;
	String DNI;
	Date FechadeNacimiento;
	String Email;
	String Tipodesangre;
	String Diregcion;
	String Peso;
	String Religion;
	String Tipodesexo;
	String Estadocivil;
	Boolean Estado;

	public int getEdad() {
		return 16;

	}

	@Override
	public String toString() {
		return "Persona [haltura=" + haltura + ",\n Nonmbre=" + Nonmbre + ",\n ApellidoPaterno=" + ApellidoPaterno
				+ ",\n ApellidMaterno=" + ApellidMaterno + ",\n Celular=" + Celular + ",\n DNI=" + DNI
				+ ",\n FechadeNacimiento=" + FechadeNacimiento + ",\n Email=" + Email + ",\n Tipodesangre=" + Tipodesangre
				+ ",\n Diregcion=" + Diregcion + ",\n Peso=" + Peso + ",\n Religion=" + Religion + ",\n Tipodesexo="
				+ Tipodesexo + ",\n Estadocivil=" + Estadocivil + ",\n Estado=" + Estado + "]";
	}

}
