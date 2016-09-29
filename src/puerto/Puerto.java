package puerto;

public class Puerto {
	
	private CargaMedioQueue Trucks;
	private CapacidadMedioQueue Ships;
	
	public Puerto(CargaMedioQueue trucks, CapacidadMedioQueue ships) {
		super();
		Trucks = trucks;
		Ships = ships;
	}
	
	public String toString(){
		String aux="Cargas:";
		int i=0;
		while (i<Trucks.medios.size()){
			aux = aux+" "+Trucks.medios.elementAt(i).getCarga();
			i++;
		}
		
		aux= aux +" Capacidades:";
		i=0;
		while (i<Ships.medios.size()){
			aux = aux+" "+Ships.medios.elementAt(i).getCapacidad();
			i++;
		}
		
		return aux;
		
	}
	

}
