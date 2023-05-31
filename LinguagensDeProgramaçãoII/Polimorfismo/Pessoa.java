public class Pessoa {
    protected String nome;
    protected String cpf;

    public Pessoa(String nome, String cpf) {
        super();
        this.nome = nome;
        this.cpf = cpf;
    }

    public void MostrarDados(){
        System.out.println("Nome: " + nome + "\nCPF: " + cpf);
    }

}
