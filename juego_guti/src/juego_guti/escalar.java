import java.util.Scanner;
import java.util.Random;
public class escalar {
	 
		public static Scanner teclado;
		public static int rollNulo;
		public static int roll1234;// roll de los niveles  1 2 3 4
		public static int roll567;// """""""""""""""""""""""
		public static int roll8910;
		public static int roll1112;
		public static int roll1314;
		public static int roll15;
	//**************Desuso por el momento*********************
		public static int cont1234;
		public static int cont567;
		public static int cont8910;
		public static int cont1112;
		public static int cont1314;
		public static int cont15;
	//***************************************
		public static int cont1234p = 0;//contador de los niveles 1 2 3
		public static int cont567p = 0;// """""""""""""""""""""""
		public static int cont8910p = 0;
		public static int cont1112p = 0;
		public static int cont1314p = 0;
	//*****************************************
		public static int NumNVL; //numero de nivel.
	//****************************************
		public static int Opusu;//opcion escogida por el usuario.
		
	private static Random rGenerador2;

	public static void escalo (){
		try{	
			escalar.siete();
			escalar.seis();
			escalar.cinco();
			escalar.cuatro();
			escalar.tres();
			escalar.dos();
		}catch(Exception ex){
			//System.out.println("introduce un numero,Se te devuelve la vida *-* y pierdes  16 de oro");
			//data.hp = data.hp+5;
			//data.oro = data.oro - (16);
			if(NumNVL >=1 && NumNVL <= 4 ){
				escalar.siete();
				}
			else if(NumNVL >=5 && NumNVL <= 7 ){
				escalar.seis();
				}
			else if(NumNVL >=8 && NumNVL <= 10 ){
				escalar.cinco();
				}
			else if(NumNVL >=11 && NumNVL <= 12 ){
				escalar.cuatro();
				}
			else if(NumNVL >=13 && NumNVL <= 14 ){
				escalar.tres();
				}
			else if(NumNVL == 15){
				escalar.dos();
				}
			}
		}
		
	
//******************************************SIETEx4*******************************************************************
	public static void siete() {	
		teclado = new Scanner (System.in);
		Random rGenerador = new Random(); 
			 NumNVL = 1;
			// try{	
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
			 					cont1234p++;
			 			}
			 
			 			else {
			 				System.out.println("#te has agarrado mal en un saliente y te has caido#");
			 				data.hp = data.hp-5;
			 				System.out.println("Pierdes 5HP");
			 			}
			 			if (data.hp <= 0){
			 				System.out.println("Te has quedado sin vida,vuelve a intentarlo cuando te recuperes");
			 				data.estadisticas();
			 				data.espera();
			 				menu.menus2();
			 			}
			 			data.estadisticas();
			 			data.espacios2();
			 		} while (roll1234 != Opusu || roll1314 != 0);
				} while (cont1234p != 4);
	/**	}catch(Exception ex){
		System.out.println("introduce un numero");
		data.espera();
		NumeroDos();
		}**/
	}
//**********************************************SEISx3*************************************************************************
			 public static void seis() {
			 do{		
				rGenerador2 = new Random(); 
			 			roll567 = rGenerador2.nextInt(6)+1; //4
			 			do {
			 				System.out.println("|-----------ok-----------------------|");
			 				System.out.println("-|Nvl("+NumNVL+")|-◘.⇑.⇑.⇑.⇑.⇑.⇑.◘-|Nvl("+NumNVL+")|-");
			 				System.out.println("|----------------------------------|");
			 				System.out.println("Escoge un camino.");
			 				
			 				Opusu = teclado.nextInt();
			 			
			 			if (roll567 == Opusu){
			 					data.oro = data.oro + (35);
			 				System.out.println("PASASTE DE NIVEl! has ganado 35 de oro!");
			 					NumNVL++;
			 					cont567p++;
			 			
			 			}
			 			else {
			 				System.out.println("te has agarrado mal en un saliente y te has caido");
			 				data.hp = data.hp-5;
			 				System.out.println("Pierdes 5HP");
			 			}
			 			if (data.hp <= 0){
			 				System.out.println("Te has quedado sin vida,vuelve a intentarlo cuando te recuperes");
			 				data.estadisticas();
			 				data.espera();
			 				menu.menus2();
			 			}
			 			data.estadisticas();
			 			data.espacios2();
			 		} while (roll567 != Opusu);
			 	} while (cont567p != 3);
			 }
//***************************************************CINCOx3*****************************************************************
			 public static void cinco() {
			 	do{		
					Random rGenerador3 = new Random(); 
				 			roll8910 = rGenerador3.nextInt(5)+1; //4
				 			do {
				 				System.out.println("|-----------okdgvg------------5t-----------|");
				 				System.out.println("-|Nvl("+NumNVL+")|-◘.⇑.⇑.⇑.⇑.⇑.◘-|Nvl("+NumNVL+")|-");
				 				System.out.println("|----------------------------------|");
				 				System.out.println("Escoge un camino.");
				 				Opusu = teclado.nextInt();
				 			if (roll8910 == Opusu){
				 					data.oro = data.oro + (50);
				 				System.out.println("PASASTE DE NIVEl! has ganado 50 de oro!");
				 					NumNVL++;
				 					cont8910p++;
				 			}
				 				
				 			else {
				 				System.out.println("te has agarrado mal en un saliente y te has caido");
				 				data.hp = data.hp-5;
				 				System.out.println("Pierdes 5HP");
				 			}
				 			if (data.hp <= 0){
				 				System.out.println("Te has quedado sin vida,vuelve a intentarlo cuando te recuperes");
				 				data.estadisticas();
				 				data.espera();
				 				menu.menus2();
				 			}
				 			data.estadisticas();
				 			data.espacios2();
				 		} while (roll8910 != Opusu);
				 	} while (cont8910p != 3);
			 }
//***************************************************CUATROx2*****************************************************************
			 	public static void cuatro() {
			 	do{		
					Random rGenerador4 = new Random(); 
				 			roll1112 = rGenerador4.nextInt(4)+1; //4
				 			do {
				 				System.out.println("|-----------okdgvg--------6745---------------|");
				 				System.out.println("-|Nvl("+NumNVL+")|-◘.⇑.⇑.⇑.⇑.◘-|Nvl("+NumNVL+")|-");
				 				System.out.println("|----------------------------------|");
				 				System.out.println("Escoge un camino.");
				 				Opusu = teclado.nextInt();
				 			if (roll1112 == Opusu){
				 					data.oro = data.oro + (58);
				 				System.out.println("PASASTE DE NIVEl! has ganado 58 de oro!");
				 					NumNVL++;
				 					cont1112p++;
				 			}
				 				
				 			else {
				 				System.out.println("te has agarrado mal en un saliente y te has caido");
				 				data.hp = data.hp-5;
				 				System.out.println("Pierdes 5HP");
				 			}
				 			if (data.hp <= 0){
				 				System.out.println("Te has quedado sin vida,vuelve a intentarlo cuando te recuperes");
				 				data.estadisticas();
				 				data.espera();
				 				menu.menus2();
				 			}
				 			data.estadisticas();
				 			data.espacios2();
				 		} while (roll1112 != Opusu);
				 	} while (cont1112p != 2);
			 	}
//****************************************************TRESx2************************************************************************************
			 	public static void tres() {
			 	do{		
					Random rGenerador5 = new Random(); 
				 			roll1314 = rGenerador5.nextInt(3)+1; //4
				 			do {
				 				System.out.println("|-----------okdgvg----------hfg-------------|");
				 				System.out.println("-|Nvl("+NumNVL+")|-◘.⇑.⇑.⇑.◘-|Nvl("+NumNVL+")|-");
				 				System.out.println("|----------------------------------|");
				 				System.out.println("Escoge un camino.");
				 				Opusu = teclado.nextInt();
				 			if (roll1314 == Opusu){
				 					data.oro = data.oro + (60);
				 				System.out.println("PASASTE DE NIVEl! has ganado 60 de oro!");
				 					NumNVL++;
				 					cont1314p++;
				 			}
				 				
				 			else {
				 				System.out.println("te has agarrado mal en un saliente y te has caido");
				 				data.hp = data.hp-5;
				 				System.out.println("Pierdes 5HP");
				 			}
				 			if (data.hp <= 0){
				 				System.out.println("Te has quedado sin vida,vuelve a intentarlo cuando te recuperes");
				 				data.estadisticas();
				 				data.espera();
				 				menu.menus2();
				 			}
				 			data.estadisticas();
				 			data.espacios2();
				 		} while (roll1314 != Opusu);
				 	} while (cont1314p != 2);
			 	}
//********************************************DOSx1*********************************************************************************************	
			 	public static void dos() {
					Random rGenerador6 = new Random(); 
				 			roll15 = rGenerador6.nextInt(2)+1; //4
				 			do {
				 				System.out.println("|-----------okdgvg-----------------------|");
				 				System.out.println("-|Nvl("+NumNVL+")|-◘.⇑.⇑.◘-|Nvl("+NumNVL+")|-");
				 				System.out.println("|----------------------------------|");
				 				System.out.println("Escoge un camino.");
				 				Opusu = teclado.nextInt();
				 			if (roll15 == Opusu){
				 					data.oro = data.oro + (400);
				 				System.out.println("PASASTE DE NIVEl! has ganado 400 de oro, Por  llegar a lo mas alto");
				 					NumNVL++;
				 					cont1314p++;
				 			}
				 				
				 			else {
				 				System.out.println("te has agarrado mal en un saliente y te has caido");
				 				data.hp = data.hp-5;
				 				System.out.println("Pierdes 5HP");
				 			}
				 			if (data.hp <= 0){
				 				System.out.println("Te has quedado sin vida,vuelve a intentarlo cuando te recuperes");
				 				data.estadisticas();
				 				data.espera();
				 				menu.menus2();
				 			}
				 			data.estadisticas();
				 			data.espacios2();
				 		} while (roll15 != Opusu);
			 		//System.out.println("◘.⇑.⇑.⇑.⇑.⇑.⇑.⇑.◘-|"+NumNVL+"Nvl|-");
			 		
			 		//System.out.println("◘.⇑.⇑.⇑.⇑.⇑.⇑.⇑.◘-|"+NumNVL+"Nvl|-");
			 		
			 	//	System.out.println("◘.⇗.⇑.⇑.⇑.⇑.⇑.⇑.◘-|"+NumNVL+"Nvl|-");
		
			//4 niveles de 7 subidas,
			 //el mismo rango 7, necesito un contador de nivel.
		}
	}
