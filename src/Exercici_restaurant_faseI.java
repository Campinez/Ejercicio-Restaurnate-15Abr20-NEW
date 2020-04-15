package src;

import java.util.Scanner;

public class Exercici_restaurant_faseI {

	public static void main(String[] args) {
		int billete5=5;
		int billete10=10;
		int billete20=20;
		int billete50=50;
		int billete100=100;
		int billete200=200;
		int billete500=500;
		int cuenta;
		String [] menu=new String [5];
		int [] precio= new int [5];
		java.util.Scanner entrada = new Scanner(System.in);
		java.util.Scanner entrada1 = new Scanner(System.in);
		
		menu [0]= "Ensalada";
		menu [1]= "Nachos";
		menu [2]= "Sopa";
		menu [3] = "Filete";
		menu [4] = "Mandarina";
		precio[0]= 15;
		precio[1]= 12;		
		precio[2]= 18;
		precio[3]= 22;
		precio[4]= 99;
		
		System.out.print(menu[3]);
		/*for (int i=0;i<precio.length; i++) {
			System.out.println("Nombre del plato:");
			menu[i]=entrada.nextLine();
			System.out.println("Precio del plato:");
			precio[i]=entrada1.nextInt();
		}*/
	}

}


