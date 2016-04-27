package juego_guti;

import java.util.*;
public class presentacion {
	public void introduccion(){
		String nombreid, passid;
		nombreid = "admin";
		passid = "admin";
		String nombre,pass;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu ID");
		nombre = teclado.nextLine();
		System.out.println("Introduce tu Password");
		pass = teclado.nextLine();
		
		if(nombre.equals(nombreid) || (pass.equals(passid))){
			System.out.println("Inicio correcto.");
			data.espera();
		}else{
			System.err.println("Error al iniciar Sesión");
			introduccion();
		}
		
	}
}
