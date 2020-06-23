import java.util.*; 

public class Biblioteca {
	private Hashtable<String, Libro> almcLibros;
	private String codigo;

    public Biblioteca(){
		almcLibros = new Hashtable<String, Libro>();
    }

    public void agregarLibro(String codigo, Libro libro) {
			this.codigo = codigo;
			almcLibros.put(codigo, libro);
    }
    
    public void mostrarLibros() {
		System.out.printf("Cantidad de Libros: %d \n",almcLibros.size());
		System.out.println("---------------------------------");
		int x =1;

		for (Enumeration <Libro> keys = almcLibros.elements(); keys.hasMoreElements();){ 
			System.out.println("Codigo Libro " + x + " :" + keys.nextElement().getCodigo());	
			x ++;
		}
		x = 1;
		System.out.println("---------------------------------");
		for (Enumeration <Libro> keys = almcLibros.elements(); keys.hasMoreElements();){ 
			System.out.println("Autor Libro " + x + " :" + keys.nextElement().getNombre());	
			x ++;
		}
		System.out.println("---------------------------------");
    }

    public boolean controloFecha (String fecha){
		boolean a = false;  
			if(fecha.length()!= 10){
				  System.out.println("Debe ingresar la fecha correctamente. ");
				  a = false;
			}else{
				if(fecha.substring(4, 5).equals("-") && fecha.substring(7, 8).equals("-")){
						a = true;
					}else{
						System.out.println("Debe ingresar la fecha de la manera que se lo pedimos: [aaaa-mm-dd] . ");
						a = false;
					}
				}
			return a;
	}
}