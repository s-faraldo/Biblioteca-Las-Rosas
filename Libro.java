public class Libro{
	// atributos
	private String codigo;
	private String nombre;
	private String tipo;
	private int year;
	private int num_pag;
	private double costo;

	// constructor vacio
	public Libro() {
	}

	// constructor con parametros
	public Libro(String codigo, String nombre, String tipo, int year, int num_pag, double costo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipo = tipo;
		this.year = year;
		this.num_pag = num_pag;
		this.costo = costo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNum_pag() {
		return num_pag;
	}

	public void setNum_pag(int num_pag) {
		this.num_pag = num_pag;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

}
