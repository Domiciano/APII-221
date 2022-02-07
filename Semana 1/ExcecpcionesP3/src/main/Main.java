package main;

import exception.NegativeMoneyException;
import exception.NotEnoughMoneyException;
import model.User;

public class Main {

	public static void main(String[] args) {
		
		User juan = new User("1231231","Juan Camilo");
		System.out.println("Saldo actual: "+juan.getWallet().getPlataDisponible());
		
		try {
			juan.pagarServicios();
		} catch (NotEnoughMoneyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NegativeMoneyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		System.out.println("Final exitoso");		
	}

}
