import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Criando Comando de entrada.
		Scanner sc = new Scanner(System.in);
		// Variavel de casos.
		int exercicio;
		
		exercicio = sc.nextInt();
		
		switch(exercicio){
			
			case 1:
				int num1;
				
				num1 = sc.nextInt();
				if(num1 < 0) {
					System.out.printf("O numero %d é um numero Negativo", num1);
				} else {
					System.out.printf("O numero %d é um numero Positivo", num1);
				}
			break;
			
			case 2:
				int num2;
				num2 = sc.nextInt();
				if(num2 % 2 == 0) {
					System.out.printf("O numero %d é Par", num2);
				} else {
					System.out.printf("O numero %d é impar", num2);
				}
			break;
				
			case 3:
				int a, b;
				
				a = sc.nextInt();
				b = sc.nextInt();
				
				if (a % b == 0 || b % a == 0) {
					System.out.println("São multiplos");
				} else { 
					System.out.println("Não são multiplos");
				}
			break;
			
			case 4:
				int inicio, fim, duracao; 
				
				inicio = sc.nextInt();
				fim = sc.nextInt();
				
				if (inicio < fim) {
					duracao = inicio - fim;
				}
				else {
					duracao = (24 - inicio) + fim;
				}
				
				System.out.println("O jogo durou " + duracao + " Horas");
			break;
			
			case 5:
				int cdItem, qtItem;
				double total = 0;
				
				cdItem = sc.nextInt();
				qtItem = sc.nextInt();
				
				if (cdItem == 1) {
					total = qtItem * 4.00;
				} else if (cdItem == 2) {
					total = qtItem * 4.50;
				} else if (cdItem == 3) {
					total = qtItem * 5.00;
				} else if (cdItem == 4) {
					total = qtItem * 2.00;
				} else if (cdItem == 5){
					total = qtItem * 1.50;
				} else {
					System.out.println("Nenhum valor selecionado");
				}
				
				System.out.printf("Valor total: %.2f", total);
			break;
			
			case 6:
				double num3;
				
				num3 = sc.nextDouble();
				
				if (num3 >= 0 && num3 < 25) {
					System.out.println("Intervalo (0, 25)");
				} else if (num3 >= 25 && num3 < 50) {
					System.out.println("Intervalo (25, 50)");
				} else if (num3 >= 50 && num3 < 75) {
					System.out.println("Intervalo (50, 75)");
				} else if (num3 >= 75 && num3 < 100) {
					System.out.println("Intervalo (75, 100)");
				} else {
					System.out.println("Fora de Intervalo");
				}
			break;
			
			case 7:
				double renda;
				double imposto = 0;
				
				renda = sc.nextDouble();
				
				if (renda <= 2000) {
					System.out.println("Isento");
					
				} else if (renda > 2000 && renda <= 3000) {
					renda = renda - 2000;
					imposto = renda * 0.08;
				
				} else if (renda > 3000 && renda <= 4500) {
					renda = renda - 3000;
					imposto = ((18 * renda) / 100) + (8 * 1000) / 100;
					
					
				} else if (renda > 4500) {
					renda = renda - 4500;
					imposto = ((28 * renda) / 100) + ((18 * 1500) / 100) + ((8 * 1000) / 100);
							
				} else {
					System.out.println("Renda Invalida.");
				
				}
				
				System.out.printf("Valor do imposto de: %.2f", imposto);
				
			break;
			default:
				System.out.println("Numero Invalido!");
				
			break;
		}
	}

}
