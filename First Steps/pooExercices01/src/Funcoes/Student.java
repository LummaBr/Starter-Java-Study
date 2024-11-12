package Funcoes;

public class Student {
	public String name;
	public double n1, n2, n3;

	public double calcNf() {
		double nf = n1 + n2 + n3;
		return nf;
	}
	
	public String result() {
		String result;
	
		double nf = n1 + n2 + n3;
		if (nf <= 60.00) {
			double falta = nf - 60.00;
			result = "Failed, Necessecita: " + falta;
		} else {
			result = "Pass";
		}
		return result;
	}
}
