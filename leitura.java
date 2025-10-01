import java.util.Scanner;

public class DemoLeitura {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		Cliente cliente = new Cliente();

		String nome;
		float montanteVendas;
		
		System.out.print("\nEntre com o nome: ");
		
		nome = sc.nextLine();
		System.out.print("\nEntre com o montanteDeVendas: ");
		montanteVendas = sc.nextFloat();

		cliente.setNome(nome);
	
cliente.setMontanteVendas(montanteVendas);

System.out.print("\n====================");
		System.out.print("\n*** Dados do cliente: "+cliente);
		
		System.out.print("\n==============\n");
		System.out.print("\nNome "+cliente.getNome() );
		System.out.print("\nMontanteDeVendas: "+cliente.getMontanteVendas() );


			sc.close();
		System.out.print("\n\n");
		}
}
