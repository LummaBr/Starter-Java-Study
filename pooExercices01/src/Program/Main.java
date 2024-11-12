package Program;
import java.util.Scanner;
import Funcoes.retangulo;
import Funcoes.funcionario;
import Funcoes.Student;

public class Main {	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha entre um dos 3 Exercicios Propostos: (1), (2) ou (3)");
		int exercicio = sc.nextInt();
		
		switch(exercicio){
			case 1:
				retangulo x;
				x = new retangulo();
				
				System.out.println("Insira a Altura e em seguida a Largura do Retangulo: ");
				x.altura = sc.nextDouble();
				x.largura = sc.nextDouble();
				
				double area = x.calcArea();
				double perimetro = x.calcPerimetro();
				double diagonal = x.calcDiagonal();
				
				System.out.println("A area do retangulo é de: " + area + ", o perimetro é de: " + perimetro + ", e o diagonal é de: " + diagonal);
			break;
			
			case 2:
				funcionario funcionario = new funcionario();
				
				System.out.println("Nome do Funcionario: ");
				funcionario.name = sc.next();
				System.out.println("Salario Bruto: ");
				funcionario.salarioBruto = sc.nextDouble();
				System.out.println("Imposto descontado: ");
				funcionario.imposto = sc.nextDouble();
				
				System.out.println("Funcionario: " + funcionario.name + ", Recebe $" + funcionario.calcSalario());
				System.out.println("Deseja Aumentar o salario do Funcionario em quantos porcentos: ");
				double porcentagem = sc.nextDouble();
				funcionario.aumentarSalario(porcentagem);
				
				System.out.println("Atualizado!");
				System.out.println(funcionario);
			break;
		
			case 3:
				Student std = new Student();
			
				System.out.println("Digite o nome do Aluno: ");
				std.name = sc.next();
				System.out.println("Primeira Nota: ");
				std.n1 = sc.nextDouble();
				System.out.println("Segunda Nota: ");
				std.n2 = sc.nextDouble();
				System.out.println("Terceira Nota: ");
				std.n3 = sc.nextDouble();
				
				System.out.println(std.calcNf());
				System.out.println(std.result());
				
			break;	
			
			default:
				System.exit(exercicio);
			break;
		}
		
		sc.close();
	}

}
