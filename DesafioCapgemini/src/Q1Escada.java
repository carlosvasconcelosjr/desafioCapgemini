// Pacote de extensão de Java.
import java.util.Scanner;

/*Algoritmo que mostrar na tela uma escada de tamanho n utilizando o caractere *
e espaços. A base e altura da escada são iguais ao valor de n. A última linha não possui espaço.
 */
public class Q1Escada {
	// método main inicia a execução do aplicativo
	public static void main(String[] args) {
		
		int numeroDelinhas, numeroDeColuna, quantidadeDeAsteriscos;

		// cria o objeto sc instanciado da classe Scanner
		Scanner sc = new Scanner(System.in); 					
		System.out.println("Digite um número inteiro para o valor de N: ");
		
		/* O método nextInt(), da instância da classe Scanner, 
	      lê o valor digitado e o armazena na variável
	      quantidadeDeAsteriscos.*/
		quantidadeDeAsteriscos = sc.nextInt(); 							
		// conta a quantidade de linhas.
		for (numeroDelinhas = 1; numeroDelinhas <= quantidadeDeAsteriscos; numeroDelinhas++) {
			
			// conta a quantidade de espaços antes de cada asterisco e imprime na tela.
			for (numeroDeColuna = quantidadeDeAsteriscos - numeroDelinhas; numeroDeColuna >= 1; numeroDeColuna--)
				System.out.print(" ");
			
			// conta a quantidade de asterisco por linha e imprime na tela
			for (numeroDeColuna = 1; numeroDeColuna <= numeroDelinhas; numeroDeColuna++) 
				System.out.print("*");
			System.out.println(); // pula uma linha linha
		}
		sc.close();
	}
}
