import java.util.Scanner;

public class Conta extends Cliente {

	public int numeroDaConta;
	public int agencia;
	public double saldo;

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numero) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o numero da conta: ");
		this.numeroDaConta = scanner.nextInt();
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o número da agencia: ");
		this.agencia = scanner.nextInt();
	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
			
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
			
		}
		
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} 
		return false;
		
	}

	public double getSaldo() {
		return this.saldo;
	}

}
