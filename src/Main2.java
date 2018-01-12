import java.util.Scanner;

import persona.Persona;

public class Main2 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Persona juan = new Persona();
		Persona pedro = new Persona();
		Persona mikel = new Persona();
		
		juan.setNombre("Juan");
		pedro.setNombre("Pedro");
		mikel.setNombre("Mikel");
		
		Persona[] cuadrilla = new Persona[4];
		cuadrilla[0] = juan;
		cuadrilla[1] = pedro;
		cuadrilla[2] = mikel;
		cuadrilla[3] = new Persona();
		cuadrilla[3].setNombre("Aritz");
		
		for(int i = 0; i < cuadrilla.length; i++){
			cuadrilla[i].setDinero(50);
			int kms = (int)(Math.random())*10+5;
			cuadrilla[i].correr(kms);
		}
		
		int[] notas = new int[21];
		
		String[] nombres = new String[23];
		nombres[0] = "Aritz";
	}

}
