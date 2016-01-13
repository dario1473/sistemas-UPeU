package pe.edu.upeu.poo.clase1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {

	public static void main(String[] args) {

		Persona dario = new Persona();
		dario.Nonmbre = "dario";
		dario.ApellidMaterno = "huaracha";
		dario.ApellidoPaterno = "mercado";
		dario.Celular = "930928430";
		dario.Diregcion = "urb.santamonica Mzc Lt9";
		dario.DNI = "43857564";
		dario.Email = "dariopro1999@gmail.com";
		dario.Estado = true;
		dario.Estadocivil = "soltero";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try {
			dario.FechadeNacimiento = sdf.parse("23/09/1999");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		dario.haltura = 1.79;
		dario.Peso = "83";
		dario.Religion = "adventista";
		dario.Religion = "+a";
		dario.Tipodesexo = "masculino";

		System.out.println(dario);
	}

}
