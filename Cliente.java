import java.util.Scanner;

public class Cliente {
	
	public String nome;
	public String cpf;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o nome do cliente: ");
		this.nome = scanner.next();
		
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o CPF do cliente: ");
		this.cpf = scanner.next();
	}

}
