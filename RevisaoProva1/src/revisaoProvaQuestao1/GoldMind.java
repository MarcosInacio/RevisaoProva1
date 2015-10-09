package revisaoProvaQuestao1;

import java.util.Random;

public class GoldMind {
	private String senha;
	
	public GoldMind()
	{
		
	}
	
	public String getSenha(){
		return this.senha;
	}
	
	Random gerador = new Random();
	String a= "";
	char letra = ' ';
	int z = 10;
	int w = 26;
	
	public void genPass(int x){
		for(int i=0; i<x; i++){
			
			int volta = gerador.nextInt(w);
			int b = volta + 97;
			letra = (char) b;
			a += letra;
			
		}
		this.senha = a;
		a = "";
	}
	
	public void nGenPass(int x){
		for(int i=0; i<x; i++){
			
			int volta = gerador.nextInt(z);
			a += String.valueOf(volta);
		}
		this.senha = a;
		a = "";
	}

	
	
}
