package Questao2;

public class ContatoTest {

	public static void main(String[] args) {
		Contato cont = new Contato("Marcos", 5);
		
		cont.adicionaNumero(4);
		cont.adicionaNumero(7);
		cont.adicionaNumero(7);
		cont.adicionaNumero(7);
		cont.adicionaNumero(7);
		//cont.adicionaNumero(7);
		System.out.println(cont.equals(cont));
		System.out.println(cont.toString());

	}

}
