package puerto;

public class Truck extends Medio{

	private String dominio;

	public Truck(int capacidad, int carga, String dominio) {
		super(capacidad, carga);
		this.dominio = dominio;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	
	
	
}
