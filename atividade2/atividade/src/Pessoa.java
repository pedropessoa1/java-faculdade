public class Pessoa {
    String nome;
    int idade;

    void mostraDados(){

        System.out.printf("%s tem %d anos de vida\n", this.nome, this.idade);

    }

    Pessoa(){
        this.nome = " Sem nome ";
        this.idade = 0;
    }

    Pessoa(String nome, int idade){

        this.nome = nome;
        this.idade = idade;
    }
}
