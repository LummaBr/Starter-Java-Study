package Program;
import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main (String[] args)	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, seguindo o anexo da aula, está aqui uma lista com 11 Exercicios para fixação de Vetores e Arrays: ");
		System.out.println("Exercicios enumerados, basta digitar o numero do exercicio que deseja executar:");
		int exercise = sc.nextInt();
		int n = 0;
		
		switch (exercise) {
		case 1:
			System.out.println("Quantos Numeros serão digitados? ");
			n = sc.nextInt();
			
			double[] num1 = new double[n];
			
			for(int i=0; i<n; i++) {
				System.out.println("Digite um Numero: ");
				num1[i] = sc.nextDouble();
			}
			
			
			System.out.println("");
			System.out.println("Numeros Negativos: ");
			for(int i=0; i<n; i++) {
				if (num1[i]<0)
				System.out.println(num1[i]);
			}
			break;
		case 2:
			System.out.println("Quantos Numeros serão digitados? ");
			n = sc.nextInt();
			
			int[] num2 = new int[n];
			
			for(int i=0; i<n; i++) {
				System.out.println("Digite um Numero: ");
				num2[i] = sc.nextInt();
			}
			
			System.out.println("Valores: ");
			int sum = 0;
			for(int i=0; i<n; i++) {
				System.out.printf("%d ", num2[i]);
				sum = sum + num2[i];
			}
				int media = sum / num2.length;
			
			System.out.println("");
			System.out.println("Soma: " + sum);
			System.out.println("Media: " + media);
			break;
		case 3:
			
			break;
		case 4:
			System.out.println("Quantos Numeros serão digitados? ");
			n = sc.nextInt();
			
			int[] num3 = new int[n];
			int numpar = 0;
			
			for(int i=0; i<n; i++) {
				System.out.println("Digite um Numero: ");
				num3[i] = sc.nextInt();
			}
			System.out.println("Numero Pares: ");
			for(int i=0; i<n; i++) {
				if (num3[i] % 2 == 0 ) {
					System.out.println(num3[i]);
				numpar++;
				}
			}
			System.out.println("Quantidade de pares: " + numpar);		
			break;
		case 5:
			int posmaior;
		    double maior;

		    System.out.print("Quantos numeros voce vai digitar? ");
		    n = sc.nextInt();

		    double[] num5 = new double[n];

		    for (int i=0; i<n; i++) {
		    	System.out.print("Digite um numero: ");
		        num5[i] = sc.nextDouble();
		    }

		    maior = num5[0];
		    posmaior = 0;

		    for (int i=1; i<n; i++) {
		        if (num5[i] > maior) {
		            maior = num5[i];
		            posmaior = i;
		        }
		    }
	
		    System.out.printf("MAIOR VALOR = %.1f\n", maior);
		    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);
			break;
		case 6:
			System.out.println("Quantos numeros serão digitados? ");
			n = sc.nextInt();
			
			double[] num6_1 = new double[n];
			double[] num6_2 = new double[n];
			double[] num6 = new double[n];
			
			for (int i=0; i<n; i++) {
				System.out.println("Digite um numero do primeiro Grupo: ");
				num6_1[i] = sc.nextDouble();
			}
			
			for (int i=0; i<n; i++) {
				System.out.println("Digite um numero do segundo Grupo: ");
				num6_2[i] = sc.nextInt();
			}
			
			for (int i=0; i<n; i++) {
				num6[i] = num6_1[i] + num6_2[i];
			}
			
			for (int i=0; i<num6.length; i++) {
				System.out.println(num6[i]);	
			}
			break;
		case 7:
			System.out.println("Quantos elementos terá no vetor? ");
			n = sc.nextInt();
			
			double[] num7 = new double[n];
			double somaC7 = 0;
			
			for (int i=0; i<n; i++) {
				System.out.println("Digite um numero: ");
				num7[i] = sc.nextDouble();
				somaC7 = somaC7 + num7[i];
			}
			
			double mediaC7 = somaC7/num7.length;
			System.out.println(mediaC7);
			
			System.out.println("Elementos abaixo da Media: ");
			for (int i=0; i<n; i++) {
				if (num7[i] < mediaC7) {
					System.out.println(num7[i]);	
				}		
			}
			break;
		case 8:
			System.out.println("Quantos numeros serão digitados: ");
			n = sc.nextInt();
			
			double[] num8 = new double[n];
			double num8_par = 0;
			double num8_npar = 0;
			for (int i=0; i<n; i++) {
				System.out.println("Digite um numero: ");
				num8[i] = sc.nextDouble();
				if (num8[i] % 2 == 0) {
					num8_par = num8_par + num8[i];
					num8_npar++;
				}
			}
			
			if (num8_par != 0) {
				double mediapar = num8_par / num8_npar;
				System.out.println("Media dos numeros pares: " + mediapar);
			} else {
				System.out.println("Nenhum numero par inserido.");
			}
			break;
		case 9:
			System.out.println("Quantas pessoas você irá digitar?");
			n = sc.nextInt();
			
			String[] num9_nome = new String[n];
			int[] num9_idade = new int[n];
			for(int i=0; i<n; i++) {
				System.out.println("Digite o nome da Pessoa: ");
				num9_nome[i] = sc.next();
				System.out.println("Digite a idade da Pessoa: ");
				num9_idade[i] = sc.nextInt();
			}
			
			maior = num9_idade[0];
			posmaior = 0;
			for (int i=1; i<n; i++) {
				if (num9_idade[i] > maior) {
					maior = num9_idade[i];
					posmaior = i;
			    }
			}
			
			System.out.println("Pessoa mais velha: " + num9_nome[posmaior]);
			break;
		case 10:
			System.out.println("Quantos alunos você irá digitar?");
			n = sc.nextInt();
			
			String[] num10_nome = new String[n];
			double[] num10_media1 = new double[n];
			double[] num10_media2 = new double[n];
			for(int i=0; i<n; i++) {
				System.out.println("Digite o nome do Aluno: ");
				num10_nome[i] = sc.next();
				System.out.println("Digite a nota do primeiro semestre: ");
				num10_media1[i] = sc.nextDouble();
				System.out.println("Digite a nota do segundo semestre: ");
				num10_media2[i] = sc.nextDouble();
			}
			
			for (int i=0; i<n; i++) {
				if ((num10_media1[i] + num10_media2[i])/2 >= 6) {
					System.out.println("Aluno " + num10_nome[i] + " Aprovado.");
			    }
			}
			break;
		case 11:
			System.out.println("Quantas pessoas você irá digitar?");
			n = sc.nextInt();
			
			String[] num11_sexo = new String[n];
			double[] num11_altura = new double[n];
			for(int i=0; i<n; i++) {
				System.out.println("Digite a altura da Pessoa: ");
				num11_altura[i] = sc.nextDouble();
				System.out.println("Digite o sexo da Pessoa: ");
				num11_sexo[i] = sc.next();
			}
			
			double num11_maior = num11_altura[0];
			double num11_menor = num11_altura[0];
			int num11_masculino = 0;
			int num11_feminino = 0;
			double num11_mediafeminina = 0;
			double num11_Cmediafeminina = 0;
			for (int i=1; i<n; i++) {
				if (num11_altura[i] > num11_maior) {
					num11_maior = num11_altura[i];
			    }
				if (num11_altura[i] < num11_menor) {
					num11_menor = num11_altura[i];
				}
				if (num11_sexo[i].equalsIgnoreCase("m")) {
					num11_masculino++;
				}
				if (num11_sexo[i].equalsIgnoreCase("f")) {
					num11_mediafeminina = num11_mediafeminina + num11_altura[i];
					num11_feminino++;		
				}
			}
			
			num11_Cmediafeminina = num11_mediafeminina / num11_feminino;
			
			System.out.println("Maior Altura: " + num11_maior);
			System.out.println("Menor Altura: " + num11_menor);
			System.out.println("Numero de Homens: " + num11_masculino);
			System.out.printf("Media de Altura Feminina: %.2f", num11_Cmediafeminina);
			break;
		default:
			System.out.println("Exercicio não existente, por favor reinicie o programa e tente novamente.");
			break;
		}
		

		sc.close();
	}
}