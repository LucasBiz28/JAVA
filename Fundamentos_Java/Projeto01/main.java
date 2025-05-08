package projeto_1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Primeiro programa em Java");
		//declaração de variavel
		String nomePessoa;
		int idadePessoa;
		float horarioTrabalhadas, valorHora = 25.0f;
		double salarioTotal;
		boolean demitido = false;
		
		/*entrada de dados
		 * usando scanner pela primeira vez
		 */
		Scanner sc = new Scanner(System.in);
		//println: mostra a expressão e pula linha
		System.out.println("Informe seu nome: ");
		/*next(): se limita a 1 palavra
		 * nomePessoa = sc.next();
		 */
		//nextLine(): Aceita Espaçamento entre as palavras e uma quantidade de caracter maior
		nomePessoa = sc.nextLine();
		
		
		//replicando conhecimento com a entrada de um inteiro e concatenando com informações coletadas anteriomente
		
		Scanner idade = new Scanner(System.in);
		System.out.println(nomePessoa+ " qual a sua idade: ");
		idadePessoa = idade.nextInt();
		System.out.println(nomePessoa+" sua idade é "+idadePessoa+ " anos");
		
	}

}

