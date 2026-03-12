package prj_tp_aula05;
import java.util.Scanner;
public class Ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		int num = sc.nextInt();
		
		String result = (num>=0) ? "NAO NEGATIVO" : "NEGATIVO";
		System.out.println(result);
		
		sc.close();
	}
}
