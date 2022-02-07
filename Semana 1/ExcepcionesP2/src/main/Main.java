package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//PEDIR FECHA DEL SISTEMA
		Date date = new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String formattedDate = sdf.format(date);
		System.out.println(formattedDate);
		
		Scanner scan = new Scanner(System.in);
		String dateInString = scan.nextLine();
		
		try {
			Date inputDate = sdf.parse(dateInString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
