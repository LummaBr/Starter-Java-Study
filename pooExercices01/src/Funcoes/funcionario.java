package Funcoes;

public class funcionario {
	
	public String name;
	public double salarioBruto;
	public double imposto;
	public double salarioLiquido;
	
	public double calcSalario() {
		double salarioLiquido = salarioBruto - imposto;
		return salarioLiquido;
	}

	
	public void aumentarSalario(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem  / 100.0;
	}

	public String toString() {
		return name + ", $" + String.format("%.2f", calcSalario());
	}
}

