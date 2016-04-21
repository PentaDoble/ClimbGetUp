package juego_guti;
import java.util.*;
public class tienda {
	private static Scanner teclado;
	private static Scanner teclado2;
	public static void shopselect(){
		data.espacios();
		System.out.println("Bienvenido a la tienda del badulake");
		System.out.println("Selecciona una Opción");
		data.estadisticas();
		System.out.println("-------------------------------");
		System.out.println("1. Pociones");
		System.out.println("2. Armaduras");
		System.out.println("0. Salir al menu");
		System.out.println("-------------------------------");
		shopgo();
	}
	public static void shopgo(){
		teclado2 = new Scanner(System.in);
		try{
			int select = teclado2.nextInt();
			switch(select){
			case 0:
				menu.menus2();
				break;
			case 1:
				pociones();
				break;
			case 2:
				System.out.println("Ir a armaduras");
				break; 
			}
		}catch(Exception e){
			System.out.println("Introduce un numero");
			shopselect();
		}
	}
	public static void pociones(){
		data.espacios();
		System.out.println("1. Elixir de Vida. Restaura 25HP. Precio: 25 gold");
		System.out.println("2. Elixir de Vida Mayor. Restaura 50HP. Precio: 50 gold ");
		System.out.println("3. Subir vida maxima. Sube 20HP. Precio: 1000 gold");
		System.out.println("0. Ir a la tienda");
		pocionesselect();
	}
	public static void pocionesselect(){
		teclado = new Scanner(System.in);
		int select = teclado.nextInt();
		switch(select){
			case 0: 
				shopselect();
				break;
			case 1:
				if(data.oro>=25){
					data.oro = data.oro - 25;
					data.hp = data.hp + 25;
				}
		}
	}
}

