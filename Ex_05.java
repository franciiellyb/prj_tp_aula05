package prj_TpAula05;
import java.util.Scanner;
public class Ex_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a hora inicial do jogo: ");
		int horaInicial = sc.nextInt();
		
		System.out.println("Informe a hora final do jogo: ");
		int horaFinal = sc.nextInt();
		
		if (horaFinal>horaInicial) {
			int duracao = (horaFinal - horaInicial); 
			System.out.println("O JOGO DUROU: " + duracao + "HORA(S)");
		} else {
			int duracao = (horaFinal - horaInicial) +24;
		System.out.println("O JOGO DUROU: " + duracao + "HORA(S)");
		}
    
		sc.close();
	}
}
