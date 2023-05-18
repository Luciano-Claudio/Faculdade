package Encapsulamento;

public class Conta {
    private float saldo;
    private String nome;
    private String cpf;
    private String tipoDeConta;
    
    public Conta(){
        saldo = 100;
    }

    public Conta(String nome, String cpf, String tipoDeConta){
        this();
        this.nome = nome;
        this.cpf = cpf;
        this.tipoDeConta = tipoDeConta;
    }

    public float GetSaldo(){
        return saldo;
    }
    
    public String GetNome(){
        return nome;
    }
    
    public String GetCpf(){
        return cpf;
    }

    public void Sacar(float total) {
        if(saldo < total){
            System.out.println("Você não tem dinheiro o suficiente na conta!");
            return;
        }
        saldo -= total;
        System.out.println("Você depositou:" + total + "R$");
    }

    public void Depositar(float total) {
        saldo += total;
        System.out.println("Você sacou:" + total + "R$");
    }

    @Override
    public String toString() {
        return nome + " de cpf " + cpf + " você tem " + saldo + "R$ na sua conta " + tipoDeConta;
    }
}
