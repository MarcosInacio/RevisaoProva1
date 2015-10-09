package questao3;

public class Pessoa {
	private String nome;
	private int cPF;
	private String paisOrigem;
	
	public Pessoa(String nome, int cPF, String paisOrigem) {
		setCPF(cPF);
		setNome(nome);
		this.paisOrigem = paisOrigem;
	}

	public int getcPF() {
		return cPF;
	}

	public void setCPF(int cPF) {
		if(cPF>0){
			this.cPF = cPF;
		}
	}

	public void setNome(String nome) {
		if(nome != null && !nome.equals("")){
			this.nome = nome;
		}
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public String getNome() {
		return nome;
	}

	
	
	
	
}
