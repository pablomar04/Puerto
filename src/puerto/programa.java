package puerto;

public class programa {

	public static void main(String[] args) {
		
		
		CapacidadMedioQueue colaBarcos = new CapacidadMedioQueue();
		CargaMedioQueue colaCamiones = new CargaMedioQueue();
		
		Ship barco1 = new Ship(500,0,"Titanic1");
		Ship barco2 = new Ship(250,0,"Titanic2");
		Ship barco3 = new Ship(415,0,"Titanic3");
		
		colaBarcos.addMedio(barco1);
		colaBarcos.addMedio(barco2);
		colaBarcos.addMedio(barco3);
		
		Truck camion1 = new Truck (10,9,"abc123");
		Truck camion2 = new Truck (15,13,"abc124");
		Truck camion3 = new Truck (10,10,"abc125");
		
		colaCamiones.addMedio(camion1);
		colaCamiones.addMedio(camion2);
		colaCamiones.addMedio(camion3);
		
		Puerto puerto1 = new Puerto(colaCamiones,colaBarcos);
		
		System.out.println(puerto1.toString());
			
	}

}
