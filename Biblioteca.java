import org.graalvm.compiler.nodes.debug.BlackholeNode;

public class Biblioteca {
    int tope;
    Libro[] libros;

    public Biblioteca(int cantidadLibros){
        libros = new Libro[cantidadLibros];
        tope = 0;
    }

    public void agregarLibro(Libro libro) throws LibreriaLlenaException {
		if (tope==libros.lenght) {
            throw new LibreriaLlenaException();
		}else{		
            libros[tope]=libro;
            tope++;}

		
	}
}