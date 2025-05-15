package Exercicio02; // Define o pacote onde a classe está localizada

import javax.swing.JOptionPane; // Importa a classe JOptionPane para exibir caixas de diálogo

public class Principal { // Declaração da classe principal do programa
    public static void main(String[] args) { // Método principal, ponto de entrada da aplicação
        int idadePessoa; // Declara uma variável para armazenar a idade da pessoa

        // Solicita ao usuário que informe a idade, usando uma caixa de entrada, e converte o valor para inteiro
        idadePessoa = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa"));

        // Verifica se a idade é menor que 16 anos
        if (idadePessoa < 16) {
            // Exibe a mensagem "Não eleitor!" para quem tem menos de 16 anos
            JOptionPane.showMessageDialog(null, "Não eleitor!");
        }
        // Verifica se a idade está entre 16 e 17 ou é maior que 65 (voto facultativo)
        else if ((idadePessoa >= 16 && idadePessoa < 18) || idadePessoa > 65) {
            // Exibe a mensagem "Eleitor Facultativo"
            JOptionPane.showMessageDialog(null, "Eleitor Facultativo");
        }
        // Caso contrário, a pessoa tem entre 18 e 65 anos (inclusive)
        else {
            // Exibe a mensagem "Eleitor Obrigatório"
            JOptionPane.showMessageDialog(null, "Eleitor Obrigatório");
        }
    }
}
