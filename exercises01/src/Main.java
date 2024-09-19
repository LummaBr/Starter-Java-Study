import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int exercicio;
		
		System.out.println("Olá, esse é um programa que executa até 5 exercicios diferentes em lista.");
		System.out.println("A descrição de cada exercicio (programa) está nele mesmo, sendo assim basta digitar um numero de 1 a 5 para começar");
		exercicio = sc.nextInt();
		
		switch (exercicio) {
		case 1:
			//Exercicio 1:
			System.out.println("1. Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa.");
			int val1 = 0;
			int val2 = 0;
			int results = 0;
			
			System.out.println("Digite o valor do Primeiro Numero:");
			val1 = sc.nextInt();
			System.out.println("Digite o valor do Segundo Numero:");
			val2 = sc.nextInt();
			results = val1 + val2;
			System.out.println("Soma de " + val1 + " + " + val2 + " equivale a " + results );
			System.out.println();
			
		break;
		case 2:
			//Exercicio 2:
			System.out.println("2. Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos. Fórmula da área: area = π . raio2. Considere o valor de π = 3.14159");
			
			double raio, area, raio2;
			double pi = 3.14159;
			
			System.out.println("Digite o valor do Raio do Ciculo a ser calculado:");
			raio = sc.nextDouble();
			
			raio2 = Math.pow(raio, 2);
			area = pi * raio2;
			System.out.printf("O valor da area de um circulo com raio %.2f. É de: %.4f %n", raio, area);
			System.out.println();
			
		break;
		case 3:
			//Exercicio 3:
			System.out.println("Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).");
			
			int A, B, C, D;
			int diferenca = 0;
			
			System.out.println("Digite o Valor de A: ");
			A = sc.nextInt();
			System.out.println("Digite o Valor de B: ");
			B = sc.nextInt();
			System.out.println("Digite o Valor de C: ");
			C = sc.nextInt();
			System.out.println("Digite o Valor de D: ");
			D = sc.nextInt();
			
			diferenca =  (A * B) - (C * D);
			System.out.printf("A diferença entre os numeros A(%d) e B (%d) para C(%d) e D(%d) é de: %d %n", A, B, C, D, diferenca);
			System.out.println();
		
		break;
		case 4:
			//Exercicio 4:
			System.out.println("Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.");
			
			int cdFuncionario;
			double salarioHora, horasTrabalhadas, salarioTotal;
			
			System.out.println("Porfavor, Digite o Codigo de Funcionario: ");
			cdFuncionario = sc.nextInt();
			System.out.println("Insira a quantidade de horas trabalhadas esse mês: ");
			horasTrabalhadas = sc.nextDouble();
			System.out.println("Insira o valor da hora desse funcionario: ");
			salarioHora = sc.nextDouble();
			
			salarioTotal = horasTrabalhadas * salarioHora;
			
			System.out.println("Codigo: " + cdFuncionario);
			System.out.printf("Salario: %.2f %n", salarioTotal);
			System.out.println();
		
		break;
		case 5:
			//Exercicio 5:
			System.out.println("Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.");	
		
			int cod1, cod2, qte1, qte2;
		    double preco1, preco2, total;

		    cod1 = sc.nextInt();
		    qte1 = sc.nextInt();
		    preco1 = sc.nextDouble();
		    
		    cod2 = sc.nextInt();
		    qte2 = sc.nextInt();
		    preco2 = sc.nextDouble();

		    total = preco1 * qte1 + preco2 * qte2;

		    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		    System.out.println();
		break;
		
		default:
			System.out.println("Numero digitado invalido, por favor reinicie o programa.");
		
		}	
	}
}
