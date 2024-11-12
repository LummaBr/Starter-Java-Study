package Control;

public class Conta {
	private int numConta;
	private String nomeTitular;
	private double saldo = 0;

	public Conta(int numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}
	
	public void setDeposito(double deposito) {
		this.saldo = this.saldo + deposito;
	}

	public void setSaque(double saque) {
		this.saldo = (this.saldo - saque) - 5.00;
	}


	// Gets
	

	public int getNumConta() {
		return numConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

}
