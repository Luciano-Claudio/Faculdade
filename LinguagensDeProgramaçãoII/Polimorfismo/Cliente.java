public class Cliente extends Pessoa{
    protected int codigo;

    public Cliente(String nome, String cpf, int codigo) {
        super(nome, cpf);
        this.codigo = codigo;
    }

    public void MostrarDados(){
        System.out.println("Nome: " + nome + "\nCPF: " + cpf + "\nCodigo: " + codigo);
    }
}
