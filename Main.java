import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dewey ="";
		String codigo ="";
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
			break;
		case 1:
			dewey = "100";
			break;
		case 2:
			dewey = "200";
			break;
		case 3:
			dewey = "300";
			break;
		case 4:
			dewey = "400";
			break;
		case 5:
			dewey = "500";
			break;
		case 6:
			dewey = "600";
			break;
		case 7:
			dewey = "700";
			break;
		case 8:
			dewey = "800";
			break;
		case 9:
			dewey = "900";
			break;		
		}
		
		System.out.println("Ingrese el autor del libro:");
		String nombre = sc.next();
		System.out.println("Ingrese el tomo del libro:");
		int tomo = sc.nextInt();
		System.out.println("Ingrese paginas del libro:");
		int paginas = sc.nextInt();
		System.out.println("Ingrese titulo del libro:");
		String titulo = sc.next();
		nombre = nombre.substring(0,3);
		codigo = dewey + "-" + nombre + "/" + paginas + "," +tomo;
		System.out.println(codigo);
					
		
	
	}

}
