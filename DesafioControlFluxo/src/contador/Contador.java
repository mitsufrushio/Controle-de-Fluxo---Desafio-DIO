package contador;

import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int param1 = sc.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int param2 = sc.nextInt();
		
		try {
			contar(param1, param2);
		} catch(ParametrosInvalidosException e) {
			e.printStackTrace();;
		}
		
		sc.close();
		
	}
	
	static void contar(int param1, int param2) {
		if(param2 < param1) {
			throw new ParametrosInvalidosException();
		} else {
			for(int i = 0; i < (param2 - param1); i++) {
				System.out.println("Imprimindo o número " + (i+1));
			}
		}
	}

}
