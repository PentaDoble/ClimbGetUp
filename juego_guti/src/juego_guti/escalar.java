import java.util.Scanner;
import java.util.Random;
public class escalar {
	 
		public static Scanner teclado;
		public static int rollNulo;
		public static int roll1234;
		public static int roll567;
		public static int roll8910;
		public static int roll1112;
		public static int roll1314;
		public static int roll15;
	//***************************************
		public static int cont1234;
		public static int cont567;
		public static int cont8910;
		public static int cont1112;
		public static int cont1314;
		public static int cont15;
	//***************************************
		public static int cont123p;
	//*****************************************
		public static int NumNVL = 1;
	//****************************************
		 static int Opusu;
	public static void NumeroDos() {
		teclado = new Scanner (System.in);
		Random rGenerador = new Random(); 
			 NumNVL = 1;
				do {
			 		roll1234 = rGenerador.nextInt(7)+1; //4
			 		do {
			 		System.out.println("|----------------------------------|");
			 		System.out.println("-|Nvl("+NumNVL+")|-◘.⇑.⇑.⇑.⇑.⇑.⇑.⇑.◘-|Nvl("+NumNVL+")|-");
			 		System.out.println("|----------------------------------|");
			 		System.out.println("Escoge un camino.");
			 		Opusu = teclado.nextInt();
			 			if (roll1234 == Opusu){
			 					data.oro = data.oro + (32);
			 				System.out.println("PASASTE DE NIVEl! has ganado 32 de oro!");
			 					NumNVL++;
			 			}
			 				
			 			else {
			 				System.out.println("#te has agarrado mal en un saliente y te has caido#");
			 				data.hp = data.hp-5;
			 				System.out.println("Pierdes 5HP");
			 			}
			 			data.estadisticas();
			 			data.espacios();
			 		} while (roll1234 != Opusu);
			 			roll567 = rGenerador.nextInt(7)+1; //4
			 			do {
			 				System.out.println("|-----------ok-----------------------|");
			 				System.out.println("-|Nvl("+NumNVL+")|-◘.⇑.⇑.⇑.⇑.⇑.⇑.⇑.◘-|Nvl("+NumNVL+")|-");
			 				System.out.println("|----------------------------------|");
			 				System.out.println("Escoge un camino.");
			 				Opusu = teclado.nextInt();
			 			if (roll1234 == Opusu){
			 					data.oro = data.oro + (32);
			 				System.out.println("PASASTE DE NIVEl! has ganado 32 de oro!");
			 					NumNVL++;
			 			}
			 				
			 			else {
			 				System.out.println("te has agarrado mal en un saliente y te has caido");
			 				data.hp = data.hp-5;
			 				System.out.println("Pierdes 5HP");
			 			}
			 			data.estadisticas();
			 			data.espacios();
			 		} while (roll1234 != Opusu);
			 		//System.out.println("◘.⇑.⇑.⇑.⇑.⇑.⇑.⇑.◘-|"+NumNVL+"Nvl|-");
			 		
			 		//System.out.println("◘.⇑.⇑.⇑.⇑.⇑.⇑.⇑.◘-|"+NumNVL+"Nvl|-");
			 		
			 	//	System.out.println("◘.⇗.⇑.⇑.⇑.⇑.⇑.⇑.◘-|"+NumNVL+"Nvl|-");
			 	} while (cont1234 == 4);
			//4 niveles de 7 subidas,
			 //el mismo rango 7, necesito un contador de nivel.
			 roll1234 = rGenerador.nextInt(7)+1; 
			System.out.println("");
			Cuenta.retirar = teclado.nextInt();
			Cuenta.NumC = Cuenta.NumC - Cuenta.retirar;
			System.out.println("");
		}
	}
}
