package com.zip.prog;

public class Operadores {

	public static void main(String[] args) {
		
		System.out.println("El jugador 1 hace su lanzamiento: ");
		
		int dado1 = (int) (Math.random() * 6) +1; 
		System.out.println("Dado 1: " + dado1);
		int dado2 = (int) (Math.random() * 6) +1;
		System.out.println("Dado 2: " + dado2);
		
		System.out.println("El jugador 2 hace su lanzamiento: ");
		
		int dado3 = (int) (Math.random() * 6) +1;
		System.out.println("Dado 1: " + dado3);
		int dado4 = (int) (Math.random() * 6) +1;
		System.out.println("Dado 2: " + dado4);
		
		int suma1 = dado1+dado2;
		int suma2 = dado3+dado4;
		int masalto = (int) (Math.max(suma1,suma2));
		
		System.out.println("La tirada más alta es " + masalto);
		
		if (suma1>suma2 && suma1!= suma2) { System.out.println("El ganador es el jugador 1 ");}
		
		else if (suma2>suma1 && suma2!= suma1) { System.out.println("El ganador es el jugador 2 ");}
		
		else if (suma1==suma2) { System.out.println("Ambos jugadores empatan");}
		
		int media = (dado1+dado2+dado3+dado4)/4; // Si quisieramos que el resultado de la media fuese decimal, podríamos definir la variable como Double
		System.out.println("La media de los cuatro dados lanzados es " + media);
	}
		

}
