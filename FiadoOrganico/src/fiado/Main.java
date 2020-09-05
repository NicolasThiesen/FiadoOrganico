package fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int[] fiados = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nome do cliente: ");
		String nome = scanner.nextLine();
		
		System.out.print("Informe o valor da compra:");
		fiados[0] = Integer.valueOf(scanner.nextLine());
		
		System.out.print("Informe o telefone do cliente:");
		String telefone = scanner.nextLine();
		
		Consumidor consumidor = new Consumidor(nome,telefone,fiados);
		
		int total = consumidor.getFiados();
		
		if(total>100) {
			System.out.println("Cliente " + consumidor.getNome() + " deve: " + total + ". Ganhou um Brinde." );
		}else {
			System.out.println("Cliente " + consumidor.getNome() + " deve: " + total);
		}
		
	}
	

}
