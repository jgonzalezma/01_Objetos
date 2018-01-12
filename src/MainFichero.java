import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import persona.Persona;

public class MainFichero {

	public static void main(String[] args) throws FileNotFoundException {
		//carga fichero con nombres de personas
		File fichero = new File("D:/Josu/Programación/nombres.txt");
		Scanner scan = new Scanner(fichero);
		//crea el array de 5 personas
		Persona[] personas = new Persona[5];
		
		//rellena el array con personas
		int i = 0;
		while(scan.hasNextLine()){
			String linea = scan.nextLine();
			String[] partesPersona = linea.split(",");
			Persona persona = new Persona();
			persona.setNombre(partesPersona[0]);
			persona.setApellido(partesPersona[1]);
			persona.setEdad(Integer.parseInt(partesPersona[2]));
			persona.setDinero(Double.parseDouble(partesPersona[3]));
			personas[i] = persona;
			System.out.println("Nombre: " + persona.getNombre() + " " + persona.getApellido() + " Edad: " + persona.getEdad() + " Saldo: " + persona.getDinero() + "€");
			i++;
		}
		for(int j=0; j < personas.length; j++){
			System.out.println(personas[j].getNombreApellido());
			personas[j].mostrarNombreApellido();
		}
		System.out.println("El primero en la lista es: ");
		Persona primera = primeroEnArray(personas);
		primera.mostrarNombreApellido();
		
		System.out.println("La media de la edad es de " + mediaEdad(personas));
		
		
		System.out.println("La suma del dinero es de " + sumaDinero(personas));
		}
	

	private static double sumaDinero(Persona[] personas) {
		double dineroTotal = 0;
		for(int i=0; i < personas.length; i++){
			dineroTotal = dineroTotal + personas[i].getDinero();
		}
		return dineroTotal;
	}


	private static double mediaEdad(Persona[] personas) {
		double sumaEdad = 0;
		for(int i=0; i < personas.length; i++){
			sumaEdad = sumaEdad
		}
		return null;
	}


	private static Persona primeroEnArray(Persona[] personas) {
		Persona primera = personas[0];
		
		for(int j=0; j < personas.length; j++){
			if(personas[j].getApellido().compareTo(primera.getApellido()) < 0){
				primera = personas[j];
			}
		}
		return primera;
	}
	
	
}
