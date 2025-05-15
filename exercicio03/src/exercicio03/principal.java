// Define o pacote onde a classe está localizada (estrutura do projeto)
package exercicio03;

// Importa a classe Scanner da biblioteca Java para ler entradas do usuário
import java.util.Scanner;

// Declaração da classe principal do programa
public class principal {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler dados do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o peso em quilogramas
        System.out.print("Digite o peso (em kg): ");
        // Lê o valor digitado e armazena na variável 'peso'
        double peso = scanner.nextDouble();

        // Solicita ao usuário que digite a altura em metros
        System.out.print("Digite a altura (em metros): ");
        // Lê o valor digitado e armazena na variável 'altura'
        double altura = scanner.nextDouble();

        // Calcula o IMC usando a fórmula: IMC = peso / (altura ao quadrado)
        double imc = peso / (altura * altura);

        // Mostra o valor do IMC com duas casas decimais
        System.out.printf("Seu IMC é: %.2f\n", imc);

        // Mostra a classificação correspondente ao IMC calculado
        System.out.println("Classificação: " + classificarIMC(imc));

        // Fecha o scanner (boa prática para liberar recursos)
        scanner.close();
    }

    // Método que recebe o IMC como parâmetro e retorna a classificação correspondente
    public static String classificarIMC(double imc) {

        // Verifica em qual faixa o IMC se enquadra e retorna a classificação apropriada
        if (imc < 16.0) {
            return "Muito abaixo do peso (IMC menor que 16)";
        } else if (imc >= 16.0 && imc <= 16.9) {
            return "Muito abaixo do peso";
        } else if (imc >= 17.0 && imc <= 18.4) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso normal";
        } else if (imc >= 25.0 && imc <= 29.9) {
            return "Acima do peso";
        } else if (imc >= 30.0 && imc <= 34.9) {
            return "Obesidade grau I";
        } else if (imc >= 35.0 && imc <= 40.0) {
            return "Obesidade grau II";
        } else {
            // Se o IMC for maior que 40, retorna grau III
            return "Obesidade grau III (IMC maior que 40)";
        }
    }
}
