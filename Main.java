import java.util.*;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Biblioteca lasRosas = new Biblioteca();
		String dewey ="";
		String codigo ="";
		String tipo ="";
		String titulo="";
		int tomo = 0;
		double costo =0;
		int paginas =0;
		String nombre ="";
		String fecha ="";
		String salida = "";
		boolean salir = false;
		boolean seleccion =false;
		boolean terminar = false;
		System.out.println("----------------------");
		System.out.println("       Bienvenido     ");
		do{
			salir = false;
			System.out.println("----------------------");
			System.out.println("0. Obras Generales");
			System.out.println("1. Filosofia");
			System.out.println("2. Religion");
			System.out.println("3. Ciencias Sociales");
			System.out.println("4. Filologia");
			System.out.println("5. Ciencias Puras");
			System.out.println("6. Ciencias Aplicadas");
			System.out.println("7. Bellas Artes");
			System.out.println("8. Literatura");
			System.out.println("9. Historia");
			System.out.println("----------------------");
			while (!salir) {
			try {
				System.out.println("Ingrese un genero:");
				int coIngresar = sc.nextInt();
				switch(coIngresar){
				case 0:
					dewey = "000";
					tipo = "Obras Generales";
					salir = true;
					break;
				case 1:
					dewey = "100";
					tipo = "Filosofia";
					salir = true;
					break;
				case 2:
					dewey = "200";
					tipo = "Religion";
					salir = true;
					break;
				case 3:
					dewey = "300";
					tipo = "Ciencias Sociales";
					salir = true;
					break;
				case 4:
					dewey = "400";
					tipo = "Filologia";
					salir = true;
					break;
				case 5:
					dewey = "500";
					tipo = "Ciencias Puras";
					salir = true;
					break;
				case 6:
					dewey = "600";
					tipo = "Ciencias Aplicadas";
					salir = true;
					break;
				case 7:
					dewey = "700";
					tipo = "Bellas Artes";
					salir = true;
					break;
				case 8:
					dewey = "800";
					tipo = "Literatura";
					salir = true;
					break;
				case 9:
					dewey = "900";
					tipo = "Historia";
					salir = true;
					break;
					default:
							System.out.println("Solo números entre 1 y 6");	
							salir = false;	
				}
			} catch (Exception e) {
				System.out.println("Debes insertar un número");
				sc.next();
		
				}
			}
			sc = new Scanner(System.in);
			System.out.println("Ingrese titulo del libro:");
			titulo = sc.nextLine();
			System.out.println("Ingrese el autor del libro:");
			nombre = sc.nextLine();
			do{
				System.out.println("Ingrese la fecha de publicacion del libro: [aaaa-mm-dd]");
				fecha = sc.nextLine();
			}while(!lasRosas.controloFecha(fecha));
			do{
				try {
					System.out.println("Ingrese el tomo del libro:");
					tomo = sc.nextInt();
					salir = true;
					} catch (Exception e) {
					System.out.println("DEBE INSERTAR UN NUMERO");
					sc.next();
					salir = false;
				}
			}while(!salir);
			do{
				try {
					System.out.println("Ingrese paginas del libro:");
					paginas = sc.nextInt();
					salir = true;
				} catch (Exception e) {
					System.out.println("DEBE INSERTAR UN NUMERO");
					sc.next();
					salir = false;
				}
			}while(!salir);
			do{
				try {
					System.out.println("Ingrese costo del libro:");
					costo = sc.nextDouble();
					salir = true;
				} catch (Exception e) {
					System.out.println("DEBE INSERTAR UN NUMERO");
					sc.next();
					salir = false;
				}
			}while(!salir);

			String codNombre = nombre.substring(0,3);
			codigo = dewey + "-" + codNombre + "/" + paginas + "," +tomo;
			Libro libro = new Libro(codigo, nombre, titulo, tipo, tomo, fecha, paginas, costo);
			lasRosas.agregarLibro(libro);
			do{ 
				sc = new Scanner(System.in);
				System.out.println("Desea ingresar otro libro? [S/N]");
				salida = sc.nextLine();
				if (salida.equalsIgnoreCase("N")){
					terminar = true;
					seleccion = true;
				}else if (salida.equalsIgnoreCase("S")){
					terminar = false;
					seleccion = true;
				}else{
					System.out.println("La opcion elegida no es valida.");
					seleccion = false;
				}
			}while(!seleccion);
		}while (!terminar);
		lasRosas.mostrarLibros();
					
		
	
	}


}
