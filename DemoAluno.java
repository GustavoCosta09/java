import java.util.Scanner;

public class DemoAluno3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Aluno2 a, b;

		String nome; 
		float nota;

		System.out.print("\nDados de a: ");
		System.out.print("\nNome: ");
		nome = sc.nextLine();
		System.out.print("Nota: ");
		nota = sc.nextFloat();
		a = new Aluno2(nome, nota);
		sc.nextLine();
		System.out.print("\nDados de b: ");
		System.out.print("\nNome: ");
		nome = sc.nextLine();
		b = new Aluno2(nome);

		System.out.print("\n==========\n");
		System.out.print("\nAluno a: "+a);
		System.out.print("\n***");
		System.out.print("\nAluno b: "+b);

		sc.close();
		System.out.print("\n\n");		
	}
}
