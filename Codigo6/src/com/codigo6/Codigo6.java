package com.codigo6;

import java.util.Scanner;

public class Codigo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numbers[];
		numbers = new int [20]; //Se inicializa el array con 20 espacios

	    for (int i = 0; i < 20; i++) { //Se le agrega otro "+" al contador
	      numbers[i] = (int) (Math.random() * 381 + 20);
	      System.out.print(numbers[i] + " "); //Se completa system.out.print
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? "); //Se completa println
	    System.out.print("(1 – Los múltiplos de 5, \n2 – Los múltiplos de 7): "); //Se agrega /n para un salto de línea
	    int opcion = sc.nextInt(); //Se cambio por un scanner el cual se inicializo

	   
	    
	         for(int number : numbers) { // Se cambia e por number y se cambia foreach por for
	        	 int multiplo = (opcion == 1) ? 5 : 7; //Se cambia de lugar "?" y ":"
	               if (number % multiplo == 0) {
	                  System.out.print("[" + number + "] ");
	       
	              } else if (number % multiplo == 0) { //Se cierra if, y se cambia else por else if 
	                   System.out.print("[" + number + "] "); //Se cambia in por out y se le da el mismo estilo de salida que en 5
	              }
	           }
	         
	         sc.close(); //Se cierra scanner
	    }
	  
	}

