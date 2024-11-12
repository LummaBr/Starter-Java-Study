package Funcoes;

public class retangulo {
	
	public double largura, altura;
	
	public double calcArea() {
		double area = largura * altura;
		return area;
	}
	
	public double calcPerimetro() {
		double perimetro = 2 * (altura + largura);
		return perimetro;
	}
	
	public double calcDiagonal() {
		double diagonal = Math.sqrt((altura * altura) + (largura * largura));
		return diagonal;
	}
	
}
