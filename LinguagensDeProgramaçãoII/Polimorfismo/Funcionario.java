public class Funcionario extends Pessoa{
    protected String matricula;
    protected double salario;

    public Funcionario(String nome, String cpf, String matricula, double salario) {
        super(nome, cpf);
        this.matricula = matricula;
        this.salario = salario;
    }

    public void MostrarDados(){
        System.out.println("Nome: " + nome + "\nCPF: " + cpf + "\nMatricula: " + matricula + "\nSalario: " + salario);
    }
}
