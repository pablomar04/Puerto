package puerto;

public class CargaMedioQueue extends MedioQueue{

	@Override
	public void addMedio(Medio m) {
		
		int i=0;
		
		while (i<medios.size()&&(m.getCarga()<medios.elementAt(i).getCarga())){
			i++;
		}
		if (i<medios.size()){
			medios.add(i, m);
		}else{
			medios.add(m);
		}
	}
}
