
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import persona.Persona;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		//crear objeto de clase persona => Josu
		Persona Josu = new Persona();
		Josu.comer();
		Josu.engordar(10);
		Josu.cambiarEdad(18);
		
		Josu.setNombre("Josu");
		Josu.setPeso(70);
		
		//asignar apellido a Josu, que se introduce por pantalla
		System.out.println("Introduce un apellido para Josu");
		String apellido = "Gonzalez";
		//String apellido = scan.nextLine();
		//Josu.setApellido(nombre);
		
		
		//asignar un dni al objeto Josu, el dni esta escrito en un fichero
		File f = new File ("D:/Josu/Programación/dni.txt");
		scan = new Scanner(f);
		String dni = scan.nextLine();
		Josu.setDni(dni);
		
		System.out.println("Mi nombre es " + Josu.getNombre());
		
		System.out.println("Soy " +Josu.getNombre() + " y peso " +Josu.getPeso() + " kg-s");
		
		//ejecutar metodo correr de objeto Josu
		Josu.correr(20);
		
		System.out.println("Soy " +Josu.getNombre() + " y peso " +Josu.getPeso() + " kg-s");
		
		Josu.setEdad(18);
		Josu.cumplirAno();
	}

}
