package revisaoProvaQuestao1;

import java.util.Scanner;

public class GoldMindTest {

	public static void main(String[] args) {
		
		GoldMind gold = new GoldMind();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bem vindo ao gerador de senhas GoldMind!");
		
		System.out.println("Digite um comando: "
				+ "\nQue seja genPass ou nGenPass");
		
		String i = input.next();
		System.out.println("Digite um numero: ");
		int a = input.nextInt();
		
		while(!i.equals("end")){
			if(i.equals("genPass")){
				gold.genPass(a);
				System.out.println(gold.getSenha());
			}	
			else if(i.equals("nGenPass")){
				gold.nGenPass(a);
				System.out.println(gold.getSenha());
			}
			else{
				System.out.println("Comando incorreto!");
			}
			System.out.println("Digite um comando: "
					+ "\nQue seja genPass ou nGenPass");
			
			i= input.next();
			System.out.println("Digite um numero: ");
			a = input.nextInt();
			
		}
		
		
//		while(i.startsWith("genPass") || i.startsWith("nGenPass")){
//			gold.genPass(a);
//			System.out.println(gold.getSenha());
//			
//			System.out.println("Digite um comando: "
//					+ "\nQue seja genPass ou nGenPass");
//			
//			i= input.next();
//			System.out.println("Digite um numero: ");
//			a = input.nextInt();
//			
//		}
		
//		while(gold.genPass(0) == genPass(0) ){
//			
//		}
		input.close();
	}

}
