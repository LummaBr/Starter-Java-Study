package converter;

public class CurrencyConverter {
	public static double Dolar = 3.10;
	public static double Reais;
	
	public static double calcValue(double convValue) {
		Reais = convValue * Dolar;
		return Reais;
	}
	
	public static double calcIOF() {
		double IOF = Reais * 6 / 100;
		return IOF;
	}
	
	public static double totalReais() {
		double totalReais = calcIOF() + Reais;
		return totalReais;
	}
}