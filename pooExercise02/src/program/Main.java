package program;
import java.util.Scanner;
import converter.CurrencyConverter;

public class Main {
	public static void main(String arg[]) {
	Scanner sc = new Scanner(System.in);
	double convValue;
	
	System.out.println("Quanto você deseja converter de Dolar para Reais (+Taxa de IOF): ");
	convValue = sc.nextDouble();
	
	System.out.printf("Valor convertido em Reais: %.2f%n", CurrencyConverter.calcValue(convValue));
	System.out.printf("Valor do IOF: %.2f%n", CurrencyConverter.calcIOF());
	System.out.printf("Valor total + IOF: %.2f", CurrencyConverter.totalReais());
	sc.close();
	}
}
