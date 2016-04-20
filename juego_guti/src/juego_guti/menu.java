package juego_guti;
import java.util.*;

public class menu {
	public static void menus2(){
		Scanner teclado = new Scanner(System.in);
		data llamada = new data();
		data.espacios();
		System.out.println("-------------------------------");
		System.out.println("Bienvenido a Climbgetup -- Version " +data.version);
		System.out.println("-------------------------------");
		System.out.println("1. Escalar");
		System.out.println("2. Abrir Puertas (Proximamente)");
		System.out.println("3. Tienda");
		System.out.println("4. Codigo");
		System.out.println("0. Exit");
		System.out.println("-------------------------------");
		menus();
	}
	public static void menus(){
		Scanner teclado = new Scanner(System.in);
		int seleccion;
		try{
		seleccion = teclado.nextInt();
		if(seleccion<=4 && seleccion >=0){
			try{
				switch(seleccion){
				case 0:
					//Aqui se sale de la aplicacion al seleccionar la opcion "0".
					System.exit(0);
					break;
				case 1:
					/*Futuro metodo que ira al start.
					escalar irastart = new escalar();
					irastart.iniciodeljuego();*/
					break;
				case 2:
					// abrir puertas
					break;
				case 3:
					//Llamada del metodo "shopselect" que se situa en tienda. shopselect hace la lista o el menu de la tienda
					tienda iratienda = new tienda();
					iratienda.shopselect();
					//Fin de la llamada del metodo.
					break;
				case 4:
					//Llamada del metodo "codigos" que se situa en data.
					codigos llamada = new codigos();
					//Fin de la llamada del metodo.
					break;
				}
			}catch(Exception e){
				//En el caso de que ponga una letra saldra este mensaje.
				System.out.println("Introduce un numero");
				//El menus2 es en el caso de que ocurra el error vuelva a ejecutar el metodo menus2.
				menus2();
			}
		}else{
			System.out.println("Introduce un valor entre 0-4");
			Thread.sleep(1000);
			menus2();
		}
		}catch(Exception e){
			System.out.println("Introduce un valor entre 0-4");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			menus2();
		}
		
	}
}
