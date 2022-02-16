
/**Classe que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. * 
 * @author Carlos Eduardo de Albquerque Vasconcelos Junior.
 * @version 1.0
 * @since Release 01 da aplicação
 */
import java.util.Scanner;

public class Q1Escada {

	public static void main(String[] args) {
		/**
		 * Variáveis que serão utilizadas na Classe
		 * 
		 * @return inteiro - Número de Linhas, Número de Colunas e Quantidade de
		 *         asteriscos.
		 */
		int numeroDelinhas, numeroDeColuna, quantidadeDeAsteriscos;

		/**
		 * Objeto que capiturará informação digitadas pelo usuário da aplicação por meio
		 * do teclado.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro para o valor de N: ");
		quantidadeDeAsteriscos = sc.nextInt();

		/**
		 * Laço For que processará o número de linhas e colunas informado pelo usuário
		 * imprimindo na tela uma escada formada por asteriscos compostos pela
		 * quantidade que possuir em cada linha.
		 */

		for (numeroDelinhas = 1; numeroDelinhas <= quantidadeDeAsteriscos; numeroDelinhas++) { // imprime cada linha
			for (numeroDeColuna = quantidadeDeAsteriscos - numeroDelinhas; numeroDeColuna >= 1; numeroDeColuna--) // espaços
				System.out.print(" "); // de espaços em cada linha.
			for (numeroDeColuna = 1; numeroDeColuna <= numeroDelinhas; numeroDeColuna++) // imprime os asterisco
				System.out.print("*");
			System.out.println(); // Pula para próxima linha
		}
		sc.close();
	}
}
