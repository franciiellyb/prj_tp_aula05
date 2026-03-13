package prj_tp_aula05;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o ponto X: ");
		double x = sc.nextDouble();
		
		System.out.println("Informe o ponto Y: ");
		double y = sc.nextDouble();
		
		if (x==0 && y==0) {
			System.out.println("Origem");
		} else if (x<0 && y>0) {
			System.out.println("Q2");
		} else if (x==0 && y!=0) {
			System.out.println("Eixo Y");
		} else if (y==0 && x!=0) {
			System.out.println("Eixo X");
		} else if (x<0 && y<0) {
			System.out.println("Q3"); 
		}  else if(x>0 && y>0) {
			System.out.println("Q1");
		} else {
			System.out.println("Q4");
		}
		sc.close();
	}
}

