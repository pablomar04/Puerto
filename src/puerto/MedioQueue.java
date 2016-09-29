package puerto;

import java.util.Vector;

public abstract class MedioQueue {

	protected Vector <Medio> medios;
	
	protected MedioQueue(){
		medios = new Vector <Medio>();
	}
	
	public abstract void addMedio(Medio m);
	
	
	
	
}
