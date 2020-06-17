public class Libro{
	// atributos
	private String codigo;
	private String nombre;
	private String tipo;
	private String fecha;
	private int paginas;
	private double costo;

	// constructor vacio
	public Libro() {
	}

	// constructor con parametros
	public Libro(String codigo, String nombre, String tipo, String fecha, int paginas, double costo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipo = tipo;
		this.fecha = fecha;
		this.paginas = paginas;
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

}
