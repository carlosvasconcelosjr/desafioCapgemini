
public class Q2SenhaSegura {

	public static void main(String[] args) {
//		String nome, senha;
//		
//		senha = "Delt@22";
//		
//		System.out.println(senha.length() + senha.indent(5));
//		System.out.println(senha.length() + senha.indent(5));
//		System.out.println(senha.contains(senha));
//		System.out.println();
//		System.out.println();
		
//		for (String sh : senha) {
//			System.out.println(sh);
//		}
		
String str = "Delt@22"; //repare o primeiro A em maiúsculo.
		
		char character = 'a';
		
		char comparador = Character.toLowerCase(character);
		
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if (Character.toLowerCase(charAt) == comparador) {
				System.out.println (character + " encontrado em " + str + " --> " + charAt);
			}else {
				System.out.println(character + "não localizado na senha!!");
			}
		}
	}

}
