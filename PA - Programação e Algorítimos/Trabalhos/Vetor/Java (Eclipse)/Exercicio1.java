import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final int TAM = 10;
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		//Laço para a leitura do vetor A
		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = in.nextInt();
			b[i]=a[i]*a[i];
		}
		//Laço para apresentar o vetor B
		System.out.println("Vetor B:");
		for (i=0; i<TAM; i++) {
			System.out.print("["+b[i]+"] ");
		}
	}
}
