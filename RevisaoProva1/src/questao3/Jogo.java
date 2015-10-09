package questao3;

public class Jogo {
	private String equipeA;
	private String equipeB;
	private String estadio;
	private int hora;
	public Jogo(String equipeA, String equipeB, String estadio, int hora) {
		setEquipeA(equipeA);
		setEquipeB(equipeB);
		setEstadio(estadio);
		setHora(hora);
	}
	public void setEquipeA(String equipeA) {
		if(equipeA != null && !equipeA.equals("")){
			this.equipeA = equipeA;
		}
	}
	public void setEquipeB(String equipeB) {
		if(equipeB != null && !equipeB.equals("")){
			this.equipeB = equipeB;
		}
	}
	public void setEstadio(String estadio) {
		if(estadio != null && !estadio.equals("")){
			this.estadio = estadio;
		}
	}
	public void setHora(int hora) {
		if(hora>=0 && hora<24){
			this.hora = hora;
		}
	}
	public String getEquipeA() {
		return equipeA;
	}
	public String getEquipeB() {
		return equipeB;
	}
	public String getEstadio() {
		return estadio;
	}
	public int getHora() {
		return hora;
	}
	
	
}
