package questao3;

import java.util.ArrayList;

public class RepositorioIngressos {
	Ingresso arr[] = new Ingresso[3];
	
	public ArrayList<String> lista(String equipe){
		ArrayList<String> nomes = new ArrayList<String>();
		
		for(int i=0; i<arr.length; i++){
			if(equipe.equals(arr[i].getJogo().getEquipeA()) || equipe.equals(arr[i].getJogo().getEquipeB())){
				nomes.add(arr[i].getPessoa().getNome());
			}
			
		}
		return nomes;
	}
	public ArrayList<String> lista2(String pais){
		ArrayList<String> quantidade = new ArrayList<String>();
		int a=0;;
		
		for(int i=0; i<arr.length; i++){
			if(pais.equals(arr[i].getPessoa().getPaisOrigem())){
				a++;
			}
		}
		
		System.out.println(a);
		return quantidade;
	}
}
