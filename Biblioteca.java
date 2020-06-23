import java.util.*; 

public class Biblioteca {
	private Hashtable<String, Libro> almcLibros;
	private String codigo;

    public Biblioteca(){
		almcLibros = new Hashtable<String, Libro>();
    }

    public void agregarLibro(Libro libro) {
			almcLibros.put(libro.getCodigo(), libro);
			this.codigo = libro.getCodigo();
    }
    
    public void mostrarLibros() {
		Enumeration enu = almcLibros.elements(); 
        System.out.printf("Cantidad de Libros: %d \n",almcLibros.size());
        System.out.println("---------------------------------");
		while (enu.hasMoreElements()) { 
			System.out.println(enu.nextElement()); 
			System.out.println(almcLibros.get(codigo));
			System.out.println("---------------------------------");
        } 	
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