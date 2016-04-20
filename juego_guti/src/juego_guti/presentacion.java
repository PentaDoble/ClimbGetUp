package juego_guti;
import java.util.*;
public class presentacion {
	public static String nombre;
	public void introduccion(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		nombre = teclado.nextLine();
	}
}
