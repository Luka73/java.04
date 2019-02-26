
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 20;
		int qtdPessoas = 2;
		boolean podeEntrar = idade >= 18 || qtdPessoas >= 3;
		
		if(podeEntrar) {
			System.out.println("Bem-vindo!");
		} else {
			System.out.println("Não pode entrar");
		}
	}

}
