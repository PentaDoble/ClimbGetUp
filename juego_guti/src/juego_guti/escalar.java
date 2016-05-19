package juego_guti;
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
		public static int cont1234 = 4; //5
		public static int cont567 = 3;	//4
		public static int cont8910 = 3; //4
		public static int cont1112 = 2; //3
		public static int cont1314 = 2; //3
		public static int cont15 = 1;	//2
	//***************************************
		public static int cont1234p = 0;
		public static int cont567p = 0;
		public static int cont8910p = 0;
		public static int cont1112p = 0;
		public static int cont1314p = 0;
		public static int cont15p = 0;
	//*****************************************
		public static int NumNVL; //numero de nivel.
		public static String normal;
		public static String dificil;
		//public static int doble;
		public static  int selectdif;
		public static  int Daño = 5;
	//****************************************
		public static int Opusu;//opcion escogida por el usuario.
	//*****************ORO*************************************
		public static int oro4=32;
		public static int oro3=43;
		public static int oro32=53;
		public static int oro2=60;
		public static int oro22=83;
		public static int oro1=400;
	private static Random rGenerador2;
	public  static  void inicioescalar () {
		teclado = new Scanner (System.in);
		System.out.println("Bienvenidos a escalar");
		System.out.println("Escoge la dificultad deseada:");
		System.out.println("1.-Normal");
		System.out.println("2.-Dificil");
		System.out.println("3.-Extremo");
		System.out.println("0.volver");


	
		selectdif = teclado.nextInt();
				
		if(selectdif == 1){
			System.out.println("Escogiste la dificultad Normal( 15 niveles)¿Quieres seguir con esta dificultad?");
			teclado = new Scanner (System.in);
			normal = teclado.nextLine();
			
			if(normal.equalsIgnoreCase("Si")){
			escalo2();
		}
			else if(normal.equalsIgnoreCase("No")) {
				inicioescalar();
			}
		}
		else if(selectdif == 2){
			System.out.println("Escogiste la dificultad Dificil( 21 niveles)¿Quieres seguir con esta dificultad?");
			teclado = new Scanner (System.in);
			dificil = teclado.nextLine();
			if(dificil.equalsIgnoreCase("Si")){
			escalo();
		}
			else if(dificil.equalsIgnoreCase("No")) {
				inicioescalar();
			}
		}
		else if(selectdif == 3){
			System.out.println("Escogiste la dificultad Extremo( 21 niveles,DañoX2)¿Quieres seguir con esta dificultad?");
			teclado = new Scanner (System.in);
			dificil = teclado.nextLine();
			if(dificil.equalsIgnoreCase("Si")){
			escalo3();
		}
			else if(dificil.equalsIgnoreCase("No")) {
				inicioescalar();
			}
		}
		else {
			menu.menus2();
		}
	}
	public static void escalo2 (){
			System.err.println("Modo Normal");
					escalar.siete();
					escalar.seis();
					escalar.cinco();
					escalar.cuatro();
					escalar.tres();
					escalar.dos();
					}
	public static void escalo (){
		
		System.err.println("Modo Dificil");
		 cont1234++; //5
		 cont567++;	//4
		 cont8910++; //4
		 cont1112++; //3
		 cont1314++; //3
		 cont15++;	//2
//*****************ORO*************************************
		 oro4=42;//32 +10
		 oro3=55;//43 +12
		 oro32=69;//53 +16
		 oro2=80;//60  +20
		 oro22=110;//83 +27
		 oro1=700;//400 +300
			escalar.siete();
			escalar.seis();
			escalar.cinco();
			escalar.cuatro();
			escalar.tres();
			escalar.dos();
	}
	public static void escalo3 (){
		
		System.err.println("Modo Dificil");
		 cont1234++; //5
		 cont567++;	//4
		 cont8910++; //4
		 cont1112++; //3
		 cont1314++; //3
		 cont15++;	//2
//***************DAÑO*************************************
		 Daño = 10;
//*****************ORO*************************************
		 oro4=42;//32 +10
		 oro3=55;//43 +12
		 oro32=69;//53 +16
		 oro2=80;//60  +20
		 oro22=110;//83 +27
		 oro1=700;//400 +300
			escalar.siete();
			escalar.seis();
			escalar.cinco();
			escalar.cuatro();
			escalar.tres();
			escalar.dos();
	}
//******************************************SIETEx4*******************************************************************
	public static void siete() {
		 do{
		teclado = new Scanner (System.in);
		Random rGenerador = new Random(); 
			 NumNVL = 1;
			
			 		roll1234 = rGenerador.nextInt(7)+1; //4
			 		do {
			 			
			 		
			 				Opusu = 0;
			 		System.out.println("|----------------------------------|");
			 		System.out.println("-|Nvl("+NumNVL+")|-◘.//|1|.|2|.|3|.|4|.|5|.|6|.|7|\\.◘-|Nvl("+NumNVL+")|-");
			 		//System.out.println("-|Nvl("+NumNVL+")|-◘.⇑.⇑.⇑.⇑.⇑.⇑.⇑.◘-|Nvl("+NumNVL+")|-");
			 		System.out.println("|----------------------------------|");
			 		System.out.println("Escoge un camino.");

			 		Opusu = teclado.nextInt();

			 			if (roll1234 == Opusu){
			 					data.oro = data.oro + (oro4);
			 				System.out.println("PASASTE DE NIVEl! has ganado 32 de oro!");
			 					NumNVL++;
			 					cont1234p++;
			 			}
			 
			 			else {
			 				System.out.println("#te has agarrado mal en un saliente y te has caido#");
			 				data.hp = data.hp-Daño;
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
			 				 				
			 		} while (roll1234!= Opusu); //|| roll1314 != 0);
		 } while (cont1234p != cont1234);
			 		
	}
//**********************************************SEISx3*************************************************************************
			 public static void seis() {
			 do{		
				rGenerador2 = new Random(); 
			 			roll567 = rGenerador2.nextInt(6)+1; //4
			 			do {
			 			//	try{
			 				System.out.println("|----------------------------------|");
			 				System.out.println("-|Nvl("+NumNVL+")|-◘.//|1|.|2|.|3|.|4|.|5|.|6|\\.◘-|Nvl("+NumNVL+")|-");
			 				System.out.println("|----------------------------------|");
			 				System.out.println("Escoge un camino.");
			 				
			 				Opusu = teclado.nextInt();
			 			
			 			if (roll567 == Opusu){
			 					data.oro = data.oro + (oro3);
			 				System.out.println("PASASTE DE NIVEl! has ganado 35 de oro!");
			 					NumNVL++;
			 					cont567p++;
			 			
			 			}
			 			else {
			 				System.out.println("te has agarrado mal en un saliente y te has caido");
			 				data.hp = data.hp-Daño;
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
			 			//	}catch(Exception ex){
				 			//	System.out.println("introduce un numero");
				 			//	data.espera();
				 				
				 				
				 		//		}
			 		} while (roll567 != Opusu);
			 	} while (cont567p != cont567);
			 }
//***************************************************CINCOx3*****************************************************************
			 public static void cinco() {
			 	do{		
					Random rGenerador3 = new Random(); 
				 			roll8910 = rGenerador3.nextInt(5)+1; //4
				 			do {
				 			//	try{
				 				
				 				System.out.println("|----------------------------------|");
				 				System.out.println("-|Nvl("+NumNVL+")|-◘.//|1|.|2|.|3|.|4|.|5|\\.◘-|Nvl("+NumNVL+")|-");
				 				System.out.println("|----------------------------------|");
				 				System.out.println("Escoge un camino.");
				 				Opusu = teclado.nextInt();
				 			if (roll8910 == Opusu){
				 					data.oro = data.oro + (oro32);
				 				System.out.println("PASASTE DE NIVEl! has ganado 50 de oro!");
				 					NumNVL++;
				 					cont8910p++;
				 			}
				 				
				 			else {
				 				System.out.println("te has agarrado mal en un saliente y te has caido");
				 				data.hp = data.hp-Daño;
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
				 			//	}catch(Exception ex){
					 		//		System.out.println("introduce un numero");
					 		//		data.espera();
					 				
					 				
					 		//		}
				 		} while (roll8910 != Opusu);
				 	} while (cont8910p != cont8910);
			 }
//***************************************************CUATROx2*****************************************************************
			 	public static void cuatro() {
			 	do{		
					Random rGenerador4 = new Random(); 
				 			roll1112 = rGenerador4.nextInt(4)+1; //4
				 			do {
				 			//	try{
				 			
				 				System.out.println("|----------------------------------|");
				 				System.out.println("-|Nvl("+NumNVL+")|-◘.//|1|.|2|.|3|.|4|\\.◘-|Nvl("+NumNVL+")|-");
				 				System.out.println("|----------------------------------|");
				 				System.out.println("Escoge un camino.");
				 				Opusu = teclado.nextInt();
				 			if (roll1112 == Opusu){
				 					data.oro = data.oro + (oro2);
				 				System.out.println("PASASTE DE NIVEl! has ganado 58 de oro!");
				 					NumNVL++;
				 					cont1112p++;
				 			}
				 				
				 			else {
				 				System.out.println("te has agarrado mal en un saliente y te has caido");
				 				data.hp = data.hp-Daño;
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
				 			//	}catch(Exception ex){
					 		//		System.out.println("introduce un numero");
					 		//		data.espera();
					 				
					 				
					 			//	}
				 		} while (roll1112 != Opusu);
				 	} while (cont1112p != cont1112);
			 	}
//****************************************************TRESx2************************************************************************************
			 	public static void tres() {
			 	do{		
					Random rGenerador5 = new Random(); 
				 			roll1314 = rGenerador5.nextInt(3)+1; //4
				 			do {
				 				//try{
				 			
				 				System.out.println("|----------------------------------|");
				 				System.out.println("-|Nvl("+NumNVL+")|-◘.//|1|.|2|.|3|\\.◘-|Nvl("+NumNVL+")|-");
				 				System.out.println("|----------------------------------|");
				 				System.out.println("Escoge un camino.");
				 				Opusu = teclado.nextInt();
				 			if (roll1314 == Opusu){
				 					data.oro = data.oro + (oro22);
				 				System.out.println("PASASTE DE NIVEl! has ganado 60 de oro!");
				 					NumNVL++;
				 					cont1314p++;
				 			}
				 				
				 			else {
				 				System.out.println("te has agarrado mal en un saliente y te has caido");
				 				data.hp = data.hp-Daño;
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
				 			//}catch(Exception ex){
					 			//	System.out.println("introduce un numero");
					 		//		data.espera();
					 				
					 				
					 		//		}
				 		} while (roll1314 != Opusu);
				 	} while (cont1314p != cont1314);
			 	}
//********************************************DOSx1*********************************************************************************************	
			 	public static void dos() {
			 		do {
					Random rGenerador6 = new Random(); 
				 			roll15 = rGenerador6.nextInt(2)+1; //4
				 			do {
				 			//	try{
				 		
				 				System.out.println("|----------------------------------|");
				 				System.out.println("-|Nvl("+NumNVL+")|-◘.//|1|.|2|\\.◘-|Nvl("+NumNVL+")|-");
				 				System.out.println("|----------------------------------|");
				 				System.out.println("Escoge un camino.");
				 				Opusu = teclado.nextInt(); //vale la pena
				 			if (roll15 == Opusu){
				 					data.oro = data.oro + (oro1);
				 				System.out.println("PASASTE DE NIVEl! has ganado 400 de oro, Por  llegar a lo mas alto");
				 					NumNVL++;
				 					cont1314p++;
				 			}
				 				
				 			else {
				 				System.out.println("te has agarrado mal en un saliente y te has caido");
				 				data.hp = data.hp-Daño;
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
				 			//	}catch(Exception ex){
					 			//	System.out.println("introduce un numero");
					 		//		data.espera();
					 				
					 				
					 		//		}
				 		} while (roll15 != Opusu);
			 		} while (cont15p != cont15);
			 		//System.out.println("◘.⇑.⇑.⇑.⇑.⇑.⇑.⇑.◘-|"+NumNVL+"Nvl|-");
			 		
			 		//System.out.println("◘.⇑.⇑.⇑.⇑.⇑.⇑.⇑.◘-|"+NumNVL+"Nvl|-");
			 		
			 	//	System.out.println("◘.⇗.⇑.⇑.⇑.⇑.⇑.⇑.◘-|"+NumNVL+"Nvl|-");
		
			//4 niveles de 7 subidas,
			 //el mismo rango 7, necesito un contador de nivel.
		}
	}
