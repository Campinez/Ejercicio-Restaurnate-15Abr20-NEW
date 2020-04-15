package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercici_restaurant_faseIII {

	public static void main(String[] args) {
		int billete5=5;
		int billete10=10;
		int billete20=20;
		int billete50=50;
		int billete100=100;
		int billete200=200;
		int billete500=500;
		int cuenta =0;
		String [] menu=new String [5];
		int [] precio= new int [5];
		java.util.Scanner entrada = new Scanner(System.in);
		java.util.Scanner entrada1 = new Scanner(System.in);
		java.util.Scanner entrada2 = new Scanner(System.in);
		java.util.Scanner entrada3 = new Scanner(System.in);
	
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
	
		
		System.out.println("Que desea usted para comer? Pulse 1-SI cuando aparezca el plato que desea y 0-NO para descartar el plato.");
		int i=0;
		ArrayList <String> eleccionMenu = new ArrayList <String>();
		for (int j=0; j<1;j++){
			do {System.out.println(menu[i]);
			int eleccionPlato= entrada2.nextInt();
			if (eleccionPlato == 1) {
				eleccionMenu.add(menu[i]);
				}
			i++;
			}while(i <menu.length);
			System.out.println("Desea usted pedir más comida? 1-SI, 0-NO");
			int eleccionContinua= entrada3.nextInt();
			switch (eleccionContinua) {
				case 0:
					break;
				case 1:
					j=0;
					i=0;
					break;
			};
		}
		for(int z=0; z<eleccionMenu.size();z++ ) {
			for (int x=0; x<menu.length;x++) {
				if (eleccionMenu.get(z) == menu[x]) {
					int suma = precio[x];
					cuenta= (cuenta+suma);
					};
				}
			}
		
		System.out.println("La cuenta asciende a "+cuenta+" €.");
		}
		
		
		
	}



/*System.out.print(eleccionMenu.get(0));
System.out.print(eleccionMenu.get(1));
System.out.print(eleccionMenu.get(2));
System.out.print(eleccionMenu.get(3));*/

/*for (int i=0;i<precio.length; i++) {
System.out.println("Nombre del plato:");
menu[i]=entrada.nextLine();
System.out.println("Precio del plato:");
precio[i]=entrada1.nextInt();
}*/
