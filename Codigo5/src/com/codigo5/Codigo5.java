package com.codigo5;

import java.util.Scanner;

public class Codigo5 {

	public static void main(String[] args) { //Se crea un metodo main
		 Scanner sc = new Scanner(System.in); //Se agrega System.in y se importa scanner
		    
		    System.out.print("Introduzca un número: "); // Se cambian comillas
		    int number = sc.nextInt(); //Se cambia el tipo de variable a int, se le cambia el nombre a la variable y se cambia el tipo de dato que recibe scanner
		    int valueNumber = number; //Se cambio el nombre de c por valueNumber
		    
		    int fortune = 0;
		    int noFortune = 0;
		    
		    while (valueNumber > 0) {
			  int digito = valueNumber % 10;
		     
			  if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				fortune++;
		       } else {
				noFortune++;		    
		       }
		      valueNumber /= 10;		    
		    }
		    
		    if (fortune > noFortune) { //Se saca a if del while
		          System.out.println("El " + number + " es un número afortunado."); //Se corrigé println y se cambia el nombre de c por number
		        } else {
		          System.out.println("El " + number + " no es un número afortunado.");//Se cambia c por number
		        }
		    
		    sc.close(); //Se cierra scanner
		} 

	}
