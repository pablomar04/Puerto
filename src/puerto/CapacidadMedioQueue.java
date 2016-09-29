package puerto;

public class CapacidadMedioQueue extends MedioQueue{
	
	
	@Override
	public void addMedio(Medio m) {
		
		int i=0;
		
		while (i<medios.size()&&(m.getCapacidad()<medios.elementAt(i).getCapacidad())){
			i++;
		}
		if (i<medios.size()){
			medios.add(i, m);
		}else{
			medios.add(m);
		}
	}

}
