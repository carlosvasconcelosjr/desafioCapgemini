import java.util.Scanner;
/*Algoritmo que informa qual é o número mínimo de
caracteres que devem ser adicionados para uma string qualquer ser considerada segura.*/
public class Q2Senha {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String senha;
		// expressão regular com a lista de ítens obrigatórios.
		final String obrigatorio = "^(?:(?=.*\\d)(?=.*[a-z])(?=.*[!@#$%^&*()-+])(?=.*[A-Z]).*)$";
		
		// expressão regular com a lista dos caracteres permitidos.
		final String permitidos = "[!@#$%^&*()-+a-zA-Z0-9]+";

		System.out.println("Digite a senha para teste e pressione Enter: ");

		while (scr.hasNextLine()) {
			
			senha = scr.nextLine();

			if (senha.length() >= 6 && senha.length() <= 32 && senha.matches(permitidos) && senha.matches(obrigatorio)) {
				System.out.println("Senha valida.");
				System.out.println("A senha informada (" + senha + ") passou no teste de complexidade!!!");
				break;
			} 
			else {
				System.out.println("Senha ("+ senha + ") não foi aprovada no teste de complexidade.");
				System.out.println("A senha informada não é segura, para criar uma senha forte, siga as intruções: ");
				System.out.println();
				System.out.println("Possui no mínimo 6 caracteres.");
				System.out.println("Contém no mínimo 1 digito.");
				System.out.println("Contém no mínimo 1 letra em minúsculo.");
				System.out.println("Contém no mínimo 1 letra em maiúsculo.");
				System.out.println("Conter no mínimo um dos seguintes caracteres: !@#$%^&*()-+");
				System.out.println();
				System.out.println("Tente novamente. Digite a senha e pressione Enter");
			}
		}
		scr.close();
	}
}
