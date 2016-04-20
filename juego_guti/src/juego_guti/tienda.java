package juego_guti;
import java.util.*;
public class tienda {
	public void shopselect(){
		data llamada = new data();
		data.espacios();
		System.out.println("Bienvenido a la tienda del badulake");
		System.out.println("Selecciona una Opción");
		data estadisticas = new data();
		estadisticas.estadisticas();
		System.out.println("-------------------------------");
		System.out.println("1. Pociones");
		System.out.println("2. Armaduras");
		System.out.println("0. Salir al menu");
		System.out.println("-------------------------------");
		shopgo();
	}
	public void shopgo(){
		Scanner teclado = new Scanner(System.in);
		try{
			int select = teclado.nextInt();
			switch(select){
			case 0:
				menu iramenu = new menu();
				iramenu.menus2();
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
	public void pociones(){
		data llamada = new data();
		data.espacios();
		System.out.println("1. Elixir de Vida. Restaura 25HP. Precio: 25 gold");
		System.out.println("2. Elixir de Vida Mayor. Restaura 50HP. Precio: 50 gold ");
		System.out.println("3. Subir vida maxima. Sube 20HP. Precio: 1000 gold");
		System.out.println("0. Ir a la tienda");
	}
	public void pocionesselect(){
		Scanner teclado = new Scanner(System.in);
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
