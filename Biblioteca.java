public class Biblioteca {
    int tope;
    Libro[] libros;

    public Biblioteca(int cantidadLibros){
        libros = new Libro[cantidadLibros];
        tope = 0;
    }

    public void agregarLibro(Libro libro) throws LibreriallenaExepcion {
		try {
			libros[tope]=libro; 
			tope ++;
		}catch(ArrayIndexOutOfBoundsException ex) {
			throw new LibreriallenaExepcion();
		}
    }
    
    public void mostrarLibros() {
        System.out.printf("Cantidad de Libros: %d \n",tope);
        System.out.println("---------------------------------");
		for(int x=0;x<tope;x++) {
			System.out.printf("Codigo: %s \nNombre: %s \nAutor: %s \nTipo: %s \nFecha: %s \nTomo: %d \nPaginas: %d \nCosto: $%.2f \n",libros[x].getCodigo(), libros[x].getTitulo(),libros[x].getNombre(),libros[x].getTipo(),libros[x].getFecha(),libros[x].getTomo(),libros[x].getPaginas(),libros[x].getCosto());
        }
    }

    public boolean controlofecha (String fecha){
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