package fiado;

public class Consumidor {
	
	// Atributos
	private String nome;
	private int[] fiados;
	private String telefone;
	
	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getFiados() {
		return this.somaFiado(fiados);
	}

	public void setFiados(int[] fiados) {
		this.fiados = fiados;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	// Constructor
	public Consumidor(String nome, String telefone, int[] fiados) {
		this.nome = nome;
		this.fiados = fiados;
		this.telefone = telefone;
	}
	
	// Method to calculate fiados
	private static int somaFiado(int[] fiados) {
		int total = 0;
		for (int f : fiados) {
			total += f;
		}
		return total;
	}
}
