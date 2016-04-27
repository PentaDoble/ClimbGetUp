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
		System.out.println("2. Armaduras. (Proximamente)");
		System.out.println("0. Salir al menu");
		System.out.println("-------------------------------");
		shopgo();
	}
	public static void shopgo(){
		teclado2 = new Scanner(System.in);
		try{
			int select = teclado2.nextInt();
			if(select <=2 && select >= 0){
				switch(select){
				case 0:
					menu.menus2();
					break;
				case 1:
					pociones();
					break;
				case 2:
					armaduras();
					break; 
				}
			}else{
				System.out.println("Introduce un numero valido.");
				data.espera();
				shopselect();
			}
		}catch(Exception e){
			System.out.println("Introduce un numero");
			data.espera();
			shopselect();
		}
	}
	public static void pociones(){
		data.espacios();
		data.estadisticas();
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
				try{
					if(data.hp >= data.hpmax){
						System.out.println("Tienes la vida al maximo.");
						data.espera();
						pociones();
					}
					if(data.oro>=25){
						data.oro = data.oro-25;
						data.hp = data.hp + 25;
						if(data.hp >= data.hpmax){
							data.hp = data.hpmax;
							pociones();
						}
						pociones();
					}else{
						System.out.println("No tienes dinero suficiente");
						data.espera();
						pociones();
					}
				}catch(Exception e){
					System.out.println("Pon un valor correcto.");
					data.espera();
					pociones();
				}
				break;
			case 2:
				try{
					if(data.hp >= data.hpmax){
						System.out.println("Tienes la vida al maximo.");
						data.espera();
						pociones();
					}
					if(data.oro>=50){
						data.oro = data.oro-50;
						data.hp = data.hp + 50;
						if(data.hp >= data.hpmax){
							data.hp = data.hpmax;
							pociones();
						}
						pociones();
					}else{
						System.out.println("No tienes dinero suficiente");
						data.espera();
						pociones();
					}
				}catch(Exception e){
					System.out.println("Pon un valor correcto.");
					data.espera();
					pociones();
				}
				break;
			case 3:
				try{
					if(data.oro>=1000){
						data.hpmax = data.hpmax + 20;
						data.oro = data.oro - 1000;
						pociones();
					}else{
						System.out.println("No tienes dinero suficiente");
						data.espera();
						pociones();
					}
				}catch(Exception e){
					System.out.println("Pon un valor correcto.");
					data.espera();
					pociones();
				}
				break;
		}
	}
	public static void armaduras(){
		data.espacios();
		data.estadisticas();
		System.out.println("1. Reparar Armadura: Precio:100 gold");
		System.out.println("2. Mejorar Armadura: Sube +3% Precio:250gold");
		System.out.println("3. Cambiar de Armadura (Proximamente)");
		System.out.println("0. Ir a la tienda");
		armadurasselect();
	}
	public static void armadurasselect(){
		teclado = new Scanner(System.in);
		int select = teclado.nextInt();
		switch(select){
			case 0: 
				shopselect();
				break;
			case 1:
				try{
					if(data.oro>=100){
						data.armorhp = 100;
						data.oro = data.oro - 100;
						armaduras();
					}else{
						System.out.println("No tienes dinero suficiente");
						data.espera();
						armaduras();
						}
				}catch(Exception e){
					System.out.println("Pon un valor correcto.");
					data.espera();
					armaduras();
				}
				break;
			case 2:
				try{
					if(data.oro>=100){
						data.armor = data.armor + 3;
						data.oro = data.oro - 250;
						armaduras();
					}else{
						System.out.println("No tienes dinero suficiente");
						data.espera();
						armaduras();
					}
				}catch(Exception e){
					System.out.println("Pon un valor correcto.");
					data.espera();
					armaduras();
				}
				break;
			case 3:
				try{
					System.out.println("No esta disponible actualmente.");
					data.espera();
					armaduras();
				}catch(Exception e){
					System.out.println("Pon un valor correcto.");
					data.espera();
					armaduras();
				}
				break;
		}
	}
}
