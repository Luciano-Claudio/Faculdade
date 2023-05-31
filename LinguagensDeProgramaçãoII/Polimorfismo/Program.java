public class Program {
    public static void main(String[] args) {
        Gerente g = new Gerente("Paulo", "123456789", "1234", 1000, 10);
        g.MostrarDados();
        System.out.println();

        Cliente c = new Cliente("Luciano", "1234565466", 101);
        c.MostrarDados();
        System.out.println();


        Funcionario f = new Funcionario("Maria", "213231312", "4321", 2000);
        f.MostrarDados();
    }
}
