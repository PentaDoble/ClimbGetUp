package juego_guti;
import java.util.*;
public class codigos {

		public	static String codigo1 = "DFGK"; //1000
		public	static String codigo2 = "OKIS"; //500
		public	static String codigo3 = "POPS"; //250
		public	static String codigo4 = "MJDC"; //1000
		public	static String codigo5 = "CACA"; //2500
		public static void codigoos(){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Ingrese un codigo.");
			teclado = new Scanner (System.in);
				System.out.println("Ingrese el codigo:");
				String ingresar = teclado.nextLine();
				
				if(ingresar.equals(codigo1)){
						System.out.println("has ganado 1000 gold!");
						codigos.codigo1 = "rgrasgfd";
					}
				else if(ingresar.equals(codigo2)){
						System.out.println("has ganado 500 gold!");
						codigos.codigo1 = "rshfg";
					}
				else if(ingresar.equals(codigo3)){
						System.out.println("has ganado 250 gold!");
						codigos.codigo1 = "rgrtujfd";
					}
				else if(ingresar.equals(codigo4)){
						System.out.println("has ganado 1000 gold!");
						codigos.codigo1 = "rgragregfd";
					}
				else if(ingresar.equals(codigo5)){
						System.out.println("has ganado 2500 gold!");
						codigos.codigo1 = "fdhaerh";
					}

		}}
