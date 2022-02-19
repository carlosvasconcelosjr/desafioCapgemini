
/**
 * Algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
 * @author Carlos Eduardo de Albquerque Vasconcelos Junior
 */
import java.util.Scanner;

public class Q1Escada2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int linha, coluna, numdeasteriscos;

		System.out.println("Digite um número inteiro para o valor de N: ");
		numdeasteriscos = sc.nextInt();

		for (linha = 1; linha <= numdeasteriscos; linha++) {
			for (coluna = numdeasteriscos - linha; coluna >= 1; coluna--)
				System.out.print(" ");
			for (coluna = 1; coluna <= linha; coluna++)
				System.out.print("*");
			System.out.println();
		}
		sc.close();
	}
}
