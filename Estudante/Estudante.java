public class Estudante {
    private String nome;
    private String cpf;
    private String curso;
    private int idade;

    public void cadastrar(String nome, String cpf, String curso, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.curso = curso;
        this.idade = idade;
    }

    public void exibirCadastro() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Curso: " + curso);
        System.out.println("Idade: " + idade);
    }
}