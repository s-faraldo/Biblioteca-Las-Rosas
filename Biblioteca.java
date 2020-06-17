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
}