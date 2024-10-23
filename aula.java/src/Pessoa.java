public class Pessoa {
    String nome, cpf;
    int idade;
    char sexo;

    Pessoa(String n, String cpf, int idade, char sexo) {
        System.out.println("Nova Pessoa no sistema.");
        this.nome = n;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }
}

