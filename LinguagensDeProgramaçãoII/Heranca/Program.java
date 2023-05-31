public class Program {
    public static void main(String[] args) {
        
        ChefeDepartamento cD = new ChefeDepartamento("Paulo", "123456789", "12/12/2000", "121212", "13/01/2023", 1000, "Gerente", "01/12/2025", 500);

        System.out.println(cD);

        Aluno a = new Aluno("Luciano", "123456789", "14/12/1998", "1212121");

        System.out.println(a);
    }
}
