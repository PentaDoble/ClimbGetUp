package juego_guti;
import java.util.*;
public class codigos {

		private static String codigo1 = "DFGK"; //1000
		private static String codigo2 = "OKIS"; //500
		private static String codigo3 = "POPS"; //250
		private static String codigo4 = "MJDC"; //1000
		private static String codigo5 = "CACA"; //2500
		
		public static void codigoos(){
			System.out.println("Ingrese un codigo.");
			Scanner teclado = new Scanner (System.in);
			String ingresar = teclado.nextLine();
				
				if(ingresar.equals(codigo1)){
						System.out.println("has ganado 1000 gold!");
						codigo1 = "no valido";
					}
				else if(ingresar.equals(codigo2)){
						System.out.println("has ganado 500 gold!");
						codigo1 = "no valido";;
					}
				else if(ingresar.equals(codigo3)){
						System.out.println("has ganado 250 gold!");
						codigo1 = "no valido";
					}
				else if(ingresar.equals(codigo4)){
						System.out.println("has ganado 1000 gold!");
						codigo1 = "no valido";
					}
				else if(ingresar.equals(codigo5)){
						System.out.println("has ganado 2500 gold!");
						codigo1 = "no valido";
					}

		}}
