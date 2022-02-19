import java.util.Scanner;

public class Temp2 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
        String senha;
        final String requeridos = "^(?:(?=.*\\d)(?=.*[a-z])(?=.*[!@#$%^&*()-+])(?=.*[A-Z]).*)$";
        final String permitidos = "[!@#$%^&*()-+a-zA-Z0-9]+";
        
        System.out.println("Informe a senha para teste: ");
        
        while(scr.hasNextLine()) {
        	//System.out.println("Informe a senha para teste: ");
            senha = scr.nextLine();
            
            if(senha.length() >=6 && senha.length() <= 32 && senha.matches(permitidos) && senha.matches(requeridos)){
                System.out.println("Senha valida.");
                System.out.println("Teste finalizado com sucesso!!!");
                //break;
            } else {
            	System.out.println(senha.length());
                System.out.println("Senha invalida.");
                System.out.println("A senha informada não é segura, para criar uma senha forte, siga as intruções: ");
                System.out.println("Possui no mínimo 6 caracteres.");
                System.out.println("Contém no mínimo 1 digito.");		
                System.out.println("Contém no mínimo 1 letra em minúsculo.");		
                System.out.println("Contém no mínimo 1 letra em maiúsculo.");		
                System.out.println("Conter no mínimo um dos seguintes caracteres: !@#$%^&*()-+");
                System.out.println();
                System.out.println("Tente novamente!!");
            }
        }
        scr.close();
		 
//		Scanner scr = new Scanner(System.in);
//	     String senha;
//	     final String requeridos = "^(?:(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*)$";
//	     final String permitidos = "[!@#$%^&*()-+a-zA-Z0-9]+";
//	     
//	     while(scr.hasNextLine()) {
//	         senha = scr.nextLine();
//	         
//		  if(senha.length() >=6 && senha.length() <= 32 && senha.matches(permitidos) && senha.matches(requeridos)){
//             System.out.println("Senha valida.");
//         } else {
//	             System.out.println("Senha invalida.");
//         }
//	     }
	}

}

//Validador de senhas com requisitos

/* Pedro e Fernando são os desenvolvedores em uma stratup e vão desenvolver o
novo sistema de cadastro, e pediram a sua ajuda. Sua task é fazer o código que
valide as senhas que são cadastradas, para isso você deve atentar aos
requisitos a seguir:
- A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula e
um número;
- A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
- Além disso, a senha pode ter de 6 a 32 caracteres.
- Entrada
A entrada contém vários casos de teste e termina com final de arquivo. Cada
linha tem uma string S, correspondente a senha que é inserida pelo usuário
no momento do cadastro.
- Saída
A saída contém uma linha, que pode ser “Senha valida.”, caso a senha tenha
cada item dos requisitos solicitados anteriormente, ou “Senha invalida.”,
se um ou mais requisitos não forem atendidos. */

//import java.util.Scanner;
//
//public class ValidadorSenhas {
// public static void main(String[] args) {
//     Scanner scr = new Scanner(System.in);
//     String senha;
//     final String requeridos = "^(?:(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*)$";
//     final String permitidos = "[a-zA-Z0-9]+";
//     
//     while(scr.hasNextLine()) {
//         senha = scr.nextLine();
//         
//         if(senha.length() >=6 && senha.length() <= 32 && senha.matches(permitidos) && senha.matches(requeridos)){
//             System.out.println("Senha valida.");
//         } else {
//             System.out.println("Senha invalida.");
//         }
//     }
// }
//}