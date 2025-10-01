[13:53, 01/10/2025] gustavo: public class Cliente {

	private String nome;
	private float montanteVendas;

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setMontanteVendas(float montanteVendas) {
		this.montanteVendas = montanteVendas;
	}
	public float getMontanteVendas() {
		return this.montanteVendas;
	}

	public String toString() {
		String r;
		r = "\nNome: "+this.nome + "\nMontante de vendas: "+this.montanteVendas;
		return r;
	}

}
[14:01, 01/10/2025] gustavo: import java.util.Scanner;
