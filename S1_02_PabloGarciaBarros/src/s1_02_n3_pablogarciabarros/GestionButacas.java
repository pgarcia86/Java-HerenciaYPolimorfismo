package s1_02_n3_pablogarciabarros;

import java.util.ArrayList;

public class GestionButacas {
	
	private ArrayList<Butaca> butacas;
	
	public GestionButacas() {
		butacas = new ArrayList<Butaca>();
	}	

	public ArrayList<Butaca> getButacas(){
		return this.butacas;
	}
	
	public void agregarButaca(Butaca butacaNueva) {
		
		try {
			chequeoButacaOcupada(butacaNueva);
			this.butacas.add(butacaNueva);
			System.out.println("Butaca Agregada");
		}
		catch(ExcepcionButacaOcupada ebo) {
			System.out.println(ebo.getMessage());
		}	
	}
	
	public void chequeoButacaOcupada(Butaca butacaNueva) throws ExcepcionButacaOcupada{
		
		if(buscarButaca(butacaNueva.getNroFila(), butacaNueva.getNroAsiento()) >= 0) {	
			throw new ExcepcionButacaOcupada("La butaca ya esta vendida. No puede agregarse");
		}		
	}
	
	public void eliminarButaca(int fila, int asiento) throws ExcepcionButacaLibre{
		
		int posicion = buscarButaca(fila, asiento);
		
		if(posicion >= 0) {
			this.butacas.remove(posicion);
		}
		else {
			throw new ExcepcionButacaLibre("La butaca esta libre. No se puede eliminar");
		}
	}
	
	public int buscarButaca(int fila, int asiento) {
		
		boolean flag = false;
		int i = 0;
		while(i < this.butacas.size()) {
			if(this.butacas.get(i).getNroFila() == fila && this.butacas.get(i).getNroAsiento() == asiento) {
				return i;
			}
			i++;
		}
			return -1;
	}

}
