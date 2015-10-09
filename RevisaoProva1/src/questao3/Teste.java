package questao3;

public class Teste {

	public static void main(String[] args) {
		Pessoa pessoaA = new Pessoa("João", 1468464, "Brasil");
		Pessoa pessoaB = new Pessoa("Anderson", 7438973, "Alemanha");
		Pessoa pessoaC = new Pessoa("Martin", 1589764, "Brasil");
		
		Jogo jogo1 = new Jogo("França", "Alemanha", "Luverd", 10);
		Jogo jogo2 = new Jogo("Brasil", "Italia", "Maracana", 22);
		
		Ingresso ingresso1 = new Ingresso(pessoaA, jogo1, "A-LESTE01");
		Ingresso ingresso2 = new Ingresso(pessoaB, jogo1, "B-OESTE05");
		Ingresso ingresso3 = new Ingresso(pessoaC, jogo2, "C-NORTE12");
		
		System.out.println(ingresso1.getPessoa().getPaisOrigem());
		
		System.out.println(ingresso2.getJogo().getEquipeA());
		System.out.println(ingresso2.getJogo().getEquipeB());
		System.out.println(ingresso2.getJogo().getEstadio());
		
		RepositorioIngressos rep = new RepositorioIngressos();
		
		System.out.println(rep.lista2("Brasil"));

	}

}
