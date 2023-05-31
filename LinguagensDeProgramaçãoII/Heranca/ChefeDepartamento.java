public class ChefeDepartamento extends Funcionario {
    protected String departamento;
    protected String dataPromocao;
    protected double gratificacao;

    public ChefeDepartamento(String nome, String cpf, String dataNasc, String matricula, String dataAdmissao,
            double salario, String departamento, String dataPromocao, double gratificacao) {
        super(nome, cpf, dataNasc, matricula, dataAdmissao, salario);
        this.departamento = departamento;
        this.dataPromocao = dataPromocao;
        this.gratificacao = gratificacao;
    }


    @Override
    public String toString() {
        return nome + " " + cpf + " " + dataNasc + " " + matricula + " " + dataAdmissao + " " + salario + " " + departamento + " " + dataPromocao + " " + gratificacao;
    }
}
