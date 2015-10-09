package Questao2;

public class Contato {
	private String nome;
	private int[] numeros;
	private int proximo;
	
	public Contato(String nome, int tamanho){
		this.nome = nome;
		this.numeros = new int[tamanho];
		this.proximo = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int[] getNumeros() {
		return numeros;
	}
	
	public void adicionaNumero(int numeros){
		if(this.proximo < this.numeros.length){
			this.numeros[proximo] = numeros;
			this.proximo++;
		}
		else{
			System.out.println("Erro!");
		}
	}
	
	public boolean equals(Object c){
		boolean r=false;
		if(c instanceof Contato){
			if(c!=null && this.nome != null ){
				r=(this.nome.equals(getNome()) && this.numeros.equals(getNumeros()));
//				for (int number : numeros) 
//				{
//					System.out.println(number);
//				}
				
			}
		}
		
		return r;
	}
	
	@Override
	public String toString(){
		return String.format("Nome: %s\nNumeros: %s", 
				getNome(), getNumeros());
	}
}
