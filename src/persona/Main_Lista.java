package persona;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class Main_Lista {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		//rellenar la lista desde fichero
		File f = new File("D:/Josu/Programación/nombres.txt");
		Scanner fichero = new Scanner(f);
		String linea;
		String [] partesPersona;
		while(fichero.hasNextLine()){
			linea = fichero.nextLine();
			partesPersona = linea.split(",");
			Persona persona = new Persona();
			persona.setNombre((partesPersona[0]));
			persona.setApellido((partesPersona[1]));
			persona.setDni((partesPersona[2]));
			persona.setTelefono((partesPersona[3]));
			personas.add(persona);
		}
		
		final int INSERTAR = 1;
		final int LISTAR = 2;
		final int FICHERO = 3;
		final int SALIR = 0;
		Scanner scan = new Scanner(System.in);
		
		int opcion;
		do {
			System.out.println("--Menu--");
			System.out.println(INSERTAR + " insertar persona");
			System.out.println(LISTAR + " listar");
			System.out.println(FICHERO +  " fichero");
			System.out.println(SALIR + " salir");
			
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case INSERTAR:
				//pedir datos persona
				System.out.println("Introduce el Nombre");
				String nombre = scan.nextLine();
				
				System.out.println("Introduce el Apellido");
				String apellido = scan.nextLine();
				
				System.out.println("Introduce el DNI");
				String dni = scan.nextLine();
				
				System.out.println("Introduce el telefono");
				String telefono = scan.nextLine();
				
				//crear persona
				Persona persona = new Persona();
				persona.setNombre(nombre);
				persona.setApellido(apellido);
				persona.setDni(dni);
				persona.setTelefono(telefono);
				//añadirlo a la lista
				personas.add(persona);
				break;
			case LISTAR:
				if(personas.isEmpty()){
					System.out.println("La lista esta vacia");
				}else{
					
				}
				Iterator<Persona> i = personas.iterator();
				while(i.hasNext()){
					Persona p = i.next();
					p.mostrarNombreApellido();
				}
				break;
			case FICHERO:
				
				break;
			case SALIR:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opcion mal");
				break;
			}
			
		} while (opcion != SALIR);
		

	}

}
