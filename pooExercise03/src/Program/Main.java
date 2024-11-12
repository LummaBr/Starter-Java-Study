package Program;
import java.util.Scanner;
import Control.Conta;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String depositoInicial;
		int opcaoConta = 0;
		
		System.out.println("Numero da Conta: ");
		int numConta = sc.nextInt();
		System.out.println("Nome do Titular: ");
		String nomeTitular = sc.next();
		System.out.println("Deseja fazer um Deposito Inicial? (Y/N) ");
		Conta conta = new Conta(numConta, nomeTitular);
		
		
		do {	
			depositoInicial = sc.next();
			
			
			if (depositoInicial.equalsIgnoreCase("Y")) {
				System.out.println("Valor do Deposito: ");
				double deposito = sc.nextDouble();
				conta.setDeposito(deposito);
			} else if (depositoInicial.equalsIgnoreCase("N")) {
				conta.setDeposito(0);
			} else {
				System.out.println("Opção Invalida, tente novamente: (Y/N)");
			}
		} while (!depositoInicial.equalsIgnoreCase("Y") && !depositoInicial.equalsIgnoreCase("N"));
		
		System.out.printf("Conta Numero: %d %n", conta.getNumConta());
		System.out.printf("Proprietario: %S %n", conta.getNomeTitular());
		System.out.printf("Saldo da Conta %.2f %n%n", conta.getSaldo());
		
		
		
		System.out.println("Selecione uma Opção: ");
		System.out.println("1 - Saque, 2 - Deposito ou Qualquer outro Numero pra Sair");
		do {
			opcaoConta = sc.nextInt();
			if (opcaoConta == 1) {
				System.out.println("Valor do Saque: ");
				double saque = sc.nextDouble();
				
				if (conta.getSaldo() <= 0) {
					System.out.println("Saldo Insulficiente para realizar o Saque.");				
			    } else {
			    	conta.setSaque(saque);
			    }
				
				System.out.printf("Conta Numero: %d %n", conta.getNumConta());
				System.out.printf("Proprietario: %S %n", conta.getNomeTitular());
				System.out.printf("Saldo da Conta %.2f %n%n", conta.getSaldo());
				
				System.out.println("Selecione uma Opção: ");
				System.out.println("1 - Saque, 2 - Deposito ou Qualquer outro Numero pra Sair");
			} else if (opcaoConta == 2) {
				System.out.println("Valor do Deposito: ");
				double deposito = sc.nextDouble();
				conta.setDeposito(deposito);
				
				System.out.printf("Conta Numero: %d %n", conta.getNumConta());
				System.out.printf("Proprietario: %S %n", conta.getNomeTitular());
				System.out.printf("Saldo da Conta %.2f %n%n", conta.getSaldo());
				
				System.out.println("Selecione uma Opção: ");
				System.out.println("1 - Saque, 2 - Deposito ou Qualquer outro Numero pra Sair");
			} else {
				opcaoConta = 3;
			}
		} while (opcaoConta != 3);
		
		sc.close();
	}

}
