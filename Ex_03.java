package prj_tp_aula05;
import java.util.Scanner;
public class Ex_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		int A = sc.nextInt();
		
		System.out.println("Informe outro número inteiro: ");
		int B = sc.nextInt();
		
		if (A>B) {
			String R = (A % B == 0) ? "Sao multiplos" : "Nao sao Multiplos";
			System.out.println(R);
		} else {
			String R = (B % A == 0) ? "Sao multiplos" : "Nao sao Multiplos";
			System.out.println(R);
		}
		
		sc.close();
	}
}
