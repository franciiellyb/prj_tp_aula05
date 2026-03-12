package prj_TpAula05;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 - Cachorro Quente: R$4,00");
		System.out.println("2 - X - Salada: R$4,50");
		System.out.println("3 - X - Bacon: R$5,00");
		System.out.println("4 - Torrada simples: R$2,00");
		System.out.println("5 - Refrigerante: R$1,50");
		
		System.out.println("Informe o código do item: ");
		int cod = sc.nextInt();
		System.out.println("Informe a quantidade: ");
		int qt = sc.nextInt();
		
		switch (cod) {
		case 1:
			System.out.println("Total: R$ " + String.format("%.2f", (qt*4)));
			break;
		case 2:
			System.out.println("Total: R$ " + String.format("%.2f", (qt*4.5)));
			break;
		case 3:
			System.out.println("Total: R$ " + String.format("%.2f", (qt*5)));
			break;
		case 4:
			System.out.println("Total: R$ " + String.format("%.2f", (qt*2)));
			break;
		case 5:
			System.out.println("Total: R$ " + String.format("%.2f", (qt*1.5)));
			break;
		default:
			System.out.println("Código inválido");
		}
		sc.close();
	}
}
