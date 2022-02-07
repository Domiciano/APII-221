package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		while(true) {
			try {
				Scanner scanner = new Scanner(System.in);
				String line1 = scanner.nextLine();
				String line2 = scanner.nextLine();
				
				int dividendo = Integer.parseInt(line1);
				int divisor = Integer.parseInt(line2);
				
				int resultado = dividendo/divisor;
				System.out.println("Resultado: "+resultado);
			}catch(NumberFormatException ex) {
				//ex.printStackTrace();
				//Es la que imprime las lineas rojas
				System.out.println("No escribiste un numero entero");
			} catch(ArithmeticException ex) {
				System.out.println("Escriste un cero como divisor");
			}
		}
		
		
	}

}
