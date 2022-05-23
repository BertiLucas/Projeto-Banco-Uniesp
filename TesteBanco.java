import java.util.Scanner;

public class TesteBanco {

	public static void main(String[] args) {

		Scanner menu = new Scanner(System.in);

		while (true) {

			System.out.println("Op��o 1 - Cadastrar Cliente ");
			System.out.println("Op��o 2 - Realizar Deposito");
			System.out.println("Op��o 3 - Realizar Saque");
			System.out.println("Op��o 4 - Consultar Saldo");
			System.out.println("Op��o 5 - SAIR");
			int opcao = menu.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Op��o Novo Cliente Selecionada");
				Cliente cliente = new Cliente();
				cliente.setNome(null);
				cliente.setCpf(null);
				Conta conta = new Conta();
				conta.setAgencia(opcao);
				conta.setNumeroDaConta(opcao);
				break;

			case 2:
				System.out.println("Op��o Realizar Deposito Selecionada");
				
				break;

			case 3:
				System.out.println("Op��o Realizar Saque Selecionada");
				break;

			case 4:
				System.out.println("Op��o Consultar Saldo Selecionada ");
				break;

			default:
				System.out.println("Op��o Inv�lida");
				break;

			case 5:
				System.out.println("At� logo!");
				menu.close();

			}

		}
	}

}
