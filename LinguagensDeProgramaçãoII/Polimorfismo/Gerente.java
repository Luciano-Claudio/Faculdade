public class Gerente extends Funcionario {
    protected int area;

    public Gerente(String nome, String cpf, String matricula, double salario, int area) {
        super(nome, cpf, matricula, salario);
        this.area = area;
    }

    public void MostrarDados(){
        System.out.println("Nome: " + nome + "\nCPF: " + cpf + "\nMatricula: " + matricula + "\nSalario: " + salario + "\nArea: " + area);
    }
}
