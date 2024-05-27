package com.codigo7;

import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {
	
	public static void main (String[] args) { //Se coloca un metodo Main

	    Scanner sc = new Scanner(System.in); // Se importó Scanner y se agrego el System.in al scanner

	    HashMap<String, String> capitales = new HashMap<>(); // Se importó HashMap, se completó "capitales" y se cambiaron los valores por Strings

	    capitales.put("Canadá", "Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    capitales.put("El Salvador", "San Salvador"); // Se colocá la capital
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	   
	    String coutry = ""; //Se cambia el nombre
	    String capital = ""; //Se inicializa capital
	    
	    try {
	      System.out.print("Escribe el nombre de un país y te diré su capital: ");
	      country = sc.nextLine();
	      
	      if (!country.equals("salir")) { //Se completó el equals
	        if (capital.containsValue(country)) {
	          System.print("La capital de " + country);
	          System.out.println(" es " + capital.put(country));
	          
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + country + "?: ");
	          String capital = sc.nextLine();
	          capital.put(country, capital);
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	    } while (!country.equals("salir");
	  } sc.close(); // Se cierra el scanner
  }
