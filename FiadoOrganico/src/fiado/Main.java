package fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumidor consumidor = new Consumidor();
		consumidor.fiados = new int[10];
		consumidor.telefone = "(11) 2222-2222";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nome do cliente: ");
		consumidor.nome = scanner.nextLine();
		
		System.out.print("Informe o valor da compra:");
		consumidor.fiados[0] = Integer.valueOf(scanner.nextLine());
		
		int total = somaFiado(consumidor.fiados);
		
		if(total>100) {
			System.out.println("Cliente " + consumidor.nome + " deve: " + total + ". Ganhou um Brinde." );
		}else {
			System.out.println("Cliente " + consumidor.nome + " deve: " + total);
		}
		
	}
	public static int somaFiado(int[] fiados) {
		int total = 0;
		for (int f : fiados) {
			total += f;
		}
		return total;
	}

}
