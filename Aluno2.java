public class Aluno {
	private String nome;
	private float nota;

	public Aluno(String nome, float nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public float getNota() {
		return this.nota;
	}
	public String toString() {
		String r;
		r = "\nNome: "+this.nome + "\nNota: "+this.nota;
		return r;
	}
}
