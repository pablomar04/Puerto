package puerto;

public class Ship extends Medio{
	
	private String nombre;

	public Ship(int capacidad, int carga, String nombre) {
		super(capacidad, carga);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	


}
