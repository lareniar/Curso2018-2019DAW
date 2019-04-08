package tienda_de_Musica;

public class Articulos {
	private int codArticulo;
	private String nombre;
	private String descripcion;
	private int stock;
	private int precio;
	private boolean garantia;
	private String categoria;
	
	
	public articulos (int codArticulo, String nombre, String descripcion, int stock, int precio, boolean garantia, String categoria) {
		this.codArticulo = codArticulo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.stock = stock;
		this.precio = precio;
		this.garantia = garantia;
		this.categoria = categoria;
	}
	
}
