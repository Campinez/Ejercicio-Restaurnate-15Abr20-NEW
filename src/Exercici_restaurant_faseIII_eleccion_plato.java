package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercici_restaurant_faseIII_eleccion_plato {

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
		java.util.Scanner entrada4 = new Scanner(System.in);
		
		for (int i=0;i<precio.length; i++) {
		System.out.println("Nombre del plato:");
		menu[i]=entrada.nextLine();
		System.out.println("Precio del plato:");
		precio[i]=entrada1.nextInt();
		}
	

	
		
		System.out.println("Que desea usted para comer? Hoy en el menú disponemos de:");
		int i=0;
		
		int eleccionContinua=0;
		for (i=0;i<menu.length;i++) {
			System.out.print(menu[i]+", ");
		}
		System.out.println(" ");
		ArrayList <String> eleccionMenu = new ArrayList <String>();
		do {
			System.out.println("Que desea comer usted?");
			eleccionMenu.add(entrada2.nextLine());
			boolean platoOk= false;
			String plato =eleccionMenu.get(eleccionMenu.size()-1);
			for (i=0; i<menu.length;i++) {
				if (plato.equals(menu[i])) {
					platoOk=true;
				}
			}
			if (platoOk==false) {
				System.out.println("El plato qu usted desea no está en el menú");
			}
			System.out.println("Desea usted otro plato? 1-SI, 0-NO");
			eleccionContinua= entrada3.nextInt();
		}while(eleccionContinua==1);
		
		System.out.println(" ");
		for(int z=0; z<eleccionMenu.size();z++ ) {
			for (int x=0; x<menu.length;x++) {
				String dato=eleccionMenu.get(z);
				String dato2=menu[x];
				if (dato.equals(dato2)) {
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


/*for (i =0;i<eleccionMenu.size();i++) {
	System.out.print(eleccionMenu.get(i));
}*/

/*menu [0]= "Ensalada";
menu [1]= "Nachos";
menu [2]= "Sopa";
menu [3] = "Filete";
menu [4] = "Mandarina";
precio[0]= 15;
precio[1]= 12;		
precio[2]= 18;
precio[3]= 22;
precio[4]= 99;*/