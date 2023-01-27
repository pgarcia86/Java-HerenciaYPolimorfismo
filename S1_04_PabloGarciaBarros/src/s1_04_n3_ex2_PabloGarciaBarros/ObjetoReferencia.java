package s1_04_n3_ex2_PabloGarciaBarros;

import java.util.Objects;

public class ObjetoReferencia {
	
	private String variable;
	
	public ObjetoReferencia() {
		variable = "Esto es un objeto de prueba";
	}
	
	public void setVariable(String variable) {
		this.variable = variable;
	}
	public String getVariable(){
		return this.variable;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ObjetoReferencia) {
			ObjetoReferencia otroObjeto = (ObjetoReferencia)obj;
			if(this.variable.equals(otroObjeto.getVariable())) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(variable);
	}

}
