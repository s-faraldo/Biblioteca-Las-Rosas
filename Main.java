import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Biblioteca lasRosas = new Biblioteca(10);
		String dewey ="";
		String codigo ="";
		String tipo ="";
		System.out.println("------------------");
		System.out.println("     Bienvenido   ");
		System.out.println("------------------");
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
		System.out.println("------------------");
		System.out.println("Ingrese un numero:");
		int coIngresar = sc.nextInt();
		switch(coIngresar){
		case 0:
			dewey = "000";
			tipo = "Obras Generales";
			break;
		case 1:
			dewey = "100";
			tipo = "Filosofia";
			break;
		case 2:
			dewey = "200";
			tipo = "Religion";
			break;
		case 3:
			dewey = "300";
			tipo = "Ciencias Sociales";
			break;
		case 4:
			dewey = "400";
			tipo = "Filologia";
			break;
		case 5:
			dewey = "500";
			tipo = "Ciencias Puras";
			break;
		case 6:
			dewey = "600";
			tipo = "Ciencias Aplicadas";
			break;
		case 7:
			dewey = "700";
			tipo = "Bellas Artes";
			break;
		case 8:
			dewey = "800";
			tipo = "Literatura";
			break;
		case 9:
			dewey = "900";
			tipo = "Historia";
			break;		
		}
		
		System.out.println("Ingrese el autor del libro:");
		String nombre = sc.next();
		System.out.println("Ingrese la fecha de publicacion del libro:");
		String fecha = sc.next();
		System.out.println("Ingrese el tomo del libro:");
		int tomo = sc.nextInt();
		System.out.println("Ingrese paginas del libro:");
		int paginas = sc.nextInt();
		System.out.println("Ingrese titulo del libro:");
		String titulo = sc.next();
		System.out.println("Ingrese costo del libro:");
		double costo = sc.nextDouble();
		Libro libro = new Libro(codigo, nombre, tipo, fecha, paginas, costo);
		lasRosas.agregarLibro(libro);
		nombre = nombre.substring(0,3);
		codigo = dewey + "-" + nombre + "/" + paginas + "," +tomo;
		System.out.println(codigo);
					
		
	
	}

}
