package Condicionais;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

	// entrada de dados
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		int idadePessoa;
		// System.out.println("Informe a idade da pessoa");
		// idadePessoa = sc.nextInt();
		idadePessoa = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa"));
		if (idadePessoa >= 18) {

			// saida de dados
			JOptionPane.showMessageDialog(null, "Entrada Liberada !");
			
		}
		else { JOptionPane.showMessageDialog(null, "Entrada não liberada");

			// saida de dados
			// System.out.println("Entrada Liberada ");
		}
	}

}
