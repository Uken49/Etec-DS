import java.util.*;
public class MultiplosDe10 {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int i;
		for (i=1; i<=100;i++) {
			if(i % 10==0) { //Se i/10 foi igual a 0 exiba i + "M�ltiplo de 10"
			 System.out.println(i+" M�ltiplo de 10");	
			}else { //Se n�o,exiba apenas i
				System.out.println(i);
			}
		}
		in.close();
	}
}
