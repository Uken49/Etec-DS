import java.util.Scanner;

public class Fatorial { //incrivelmente dif�cil
	public static void main(String[] args) {
		int num, i = 1, fat=1;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o n�mero: ");
		num = in.nextInt(); //Digitar o n�mero

		i = num - i; //Definir valor do contador
		fat = i * num; //Multiplica i pelo numero
		do {
			i--;
			fat = i * fat; //Fazer o fatorial
		} while (i > 1);
		System.out.println("O fatorial de "+num+" �: "+fat);
		in.close();
	}
}
// n!=n*(n-1)*(n-2)*(n-3)...=res