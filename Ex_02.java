package prj_tp_aula05;
import java.util.Scanner;
public class Ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		int n = sc.nextInt();
		
		String r = (n % 2 == 0) ? "PAR" : "IMPAR";
		System.out.println(r);
		
		sc.close();
	}
}
