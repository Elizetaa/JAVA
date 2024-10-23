//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("luiz", "202.123.123-00", 19, 'M');


        Conta c1 = new Conta("12345", p1);

        // System.out.println(c1.saldo);
        // System.out.println(c1.titular.nome);
        // System.out.println("Saldo da conta " + c1.numero + "\n: " +c1.saldo);

        c1.extrato();
        String c2 = "xablau";

    }
}