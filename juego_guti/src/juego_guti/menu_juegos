package juego_guti;
import java.util.*;

public class menu_juegos {
	public static void menu_juego(){
		Scanner teclado2 = new Scanner(System.in);
		
		data.espacios();
		System.out.println("-------------------------------");
		System.out.println("Menu de Juegos -- Version " +data.version);
		System.out.println("-------------------------------");
		System.out.println("1. Escalar");
		System.out.println("2. Matematicas Temporales");
		System.out.println("0. Ir al Menu");
		System.out.println("-------------------------------");
		menu2();
		
	}
	public static void menu2(){
		Scanner teclado = new Scanner(System.in);
		int seleccion;
		try{
		seleccion = teclado.nextInt();
		if(seleccion<=4 && seleccion >=0){
			try{
				switch(seleccion){
				case 0:
					//Aqui se sale de la aplicacion al seleccionar la opcion "0".
					menu.menus2();
					break;
				case 1:
					escalar.escalo();
					/*Futuro metodo que ira al start.
					escalar irastart = new escalar();
					irastart.iniciodeljuego();*/
					break;
				case 2:
					matematicas_temporales.juego();
					break;
				}
			}catch(Exception e){
				//En el caso de que ponga una letra saldra este mensaje.
				System.out.println("Introduce un numero");
				//El menus2 es en el caso de que ocurra el error vuelva a ejecutar el metodo menus2.
				menu_juego();
			}
		}else{
			System.out.println("Introduce un valor entre 0-4");
			Thread.sleep(1000);
			menu_juego();
		}
		}catch(Exception e){
			System.out.println("Introduce un valor entre 0-4");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			menu_juego();
		}
	}
}
