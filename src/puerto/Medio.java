package puerto;

public class Medio {
	
	private int capacidad;
	private int carga;
	
	public Medio(int capacidad, int carga) {
		super();
		this.capacidad = capacidad;
		this.carga = carga;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public void cargar(int carga){
		if (this.carga+carga<capacidad){
			this.carga+=carga;
		}else{
			System.out.println("No es posible cargar "+carga+"tn. No hay espacio");
		}
	}
	
	public void descargar (int descarga){
		if (descarga<=this.carga){
			this.carga-=descarga;
		}
	}
	

}
