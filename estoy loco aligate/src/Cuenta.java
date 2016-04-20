import java.util.Scanner;
public class Cuenta {
		public static Scanner teclado;
		static double NumC = 0;
		static String ingresar;
		static int retirar;
		static int opcion;
		static String cuenta;
		static double cant;
		public static int mas;
	public static void inicio() {
		
		teclado = new Scanner (System.in);
		System.out.println("bienvenido a climbgetup");
		System.out.println("1. Escalar");
		System.out.println("2. Abri puertas(Proximamente)");
		System.out.println("3. Tienda");
		System.out.println("4. Codigo");
		System.out.println("5. Exit");
		
		opcion = teclado.nextInt();
	}
	public static void NumeroUno() {
		teclado = new Scanner (System.in);
		if ( opcion == 4 ) {
			System.out.println("Ingrese el codigo:");
			ingresar = teclado.nextLine();
			
			if(ingresar.equals(Codigos.codigo1)){
					System.out.println("has ganado 1000 gold!");
					Codigos.codigo1 = "rgrasgfd";
				}
			else if(ingresar.equals(Codigos.codigo2)){
					System.out.println("has ganado 500 gold!");
					Codigos.codigo1 = "rshfg";
				}
			else if(ingresar.equals(Codigos.codigo3)){
					System.out.println("has ganado 250 gold!");
					Codigos.codigo1 = "rgrtujfd";
				}
			else if(ingresar.equals(Codigos.codigo4)){
					System.out.println("has ganado 1000 gold!");
					Codigos.codigo1 = "rgragregfd";
				}
			else if(ingresar.equals(Codigos.codigo5)){
					System.out.println("has ganado 2500 gold!");
					Codigos.codigo1 = "fdhaerh";
				}

		}}

		 public static void NumeroTres(){
		if (opcion == 3) {
			
		}
			System.out.println("¿A que cuenta quieres hacer una transferencia?");
				cuenta = teclado.nextLine();
			System.out.println("¿que cantidad deseas transferir?");
				cant = teclado.nextInt();
				NumC = NumC - cant;
			System.out.println("Su transferencia se a realiado con exito");
		
			opcion = 0;
			teclado = new Scanner (System.in);
			System.out.println("¿desea realizar mas movimientos?(1/0)");
			mas = teclado.nextInt();
		
	}
}

