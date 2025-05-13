// Define o pacote ao qual essa classe pertence
package Exercicio01;

// Importa a classe JOptionPane da biblioteca Swing para criar caixas de diálogo
import javax.swing.JOptionPane;

// Define a classe principal do programa
public class principal {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Declara uma variável inteira para armazenar a idade da pessoa
        int idadePessoa;

        // Exibe uma caixa de entrada para o usuário digitar a idade e converte o valor para inteiro
        idadePessoa = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa"));

        // Verifica se a idade é menor que 18
        if (idadePessoa < 18) {
            // Mostra uma mensagem indicando que a pessoa é menor de idade
            JOptionPane.showMessageDialog(null, "Menor de idade !");
        }

        // Verifica se a idade está entre 18 e 64 (inclusive)
        else if (idadePessoa >= 18 && idadePessoa <= 64) {
            // Mostra uma mensagem indicando que a pessoa é maior de idade
            JOptionPane.showMessageDialog(null, "Maior de idade ");
        }

        // Caso contrário, a pessoa tem 65 anos ou mais
        else {
            // Mostra uma mensagem indicando que a pessoa é idosa
            JOptionPane.showMessageDialog(null, "Idoso");
        }
    }
}
