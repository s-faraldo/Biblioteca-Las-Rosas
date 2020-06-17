import org.graalvm.compiler.nodes.debug.BlackholeNode;

public class Biblioteca {
    int tope;
    Libro[] libros;

    public Biblioteca(int cantidadLibros){
        libros = new Libro[cantidadLibros];
        tope = 0;
    }

    public void agregarLibro(Libro libro) throws LibreriallenaExepcion {
		if (tope==libros.lenght) {
            throw new LibreriallenaExepcion();
		}else{		
            libros[tope]=libro;
            tope++;}

		
	}
}