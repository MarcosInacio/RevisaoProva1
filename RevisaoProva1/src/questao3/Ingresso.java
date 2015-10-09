package questao3;

public class Ingresso {
	private Pessoa pessoa;
	private Jogo jogo;
	private String assentoEscolhido;
	
	
	public Ingresso(Pessoa pessoa, Jogo jogo, String assentoEscolhido) {
		setPessoa(pessoa);
		setJogo(jogo);
		setAssentoEscolhido(assentoEscolhido);
	}
	
	public void setPessoa(Pessoa pessoa) {
		if(pessoa != null){
			this.pessoa = pessoa;
		}
	}
	public void setJogo(Jogo jogo) {
		if(jogo != null){
			this.jogo = jogo;
		}
	}
	public void setAssentoEscolhido(String assentoEscolhido) {
		if(assentoEscolhido != null && !assentoEscolhido.equals("")){
			this.assentoEscolhido = assentoEscolhido;
		}
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public String getAssentoEscolhido() {
		return assentoEscolhido;
	}
	
	
}
