public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa p1 = new Pessoa();
        p1.nome = "Fulano de tal";
        p1.idade = 21;
        //System.out.printf("%s tem %d anos de vida\n", p1.nome, p1.idade);
        p1.mostraDados();

        Pessoa p2 = new Pessoa();
        p2.nome = "Beltrano de tal";
        p2.idade = 35;
        //System.out.printf("%s tem %d anos de vida\n", p2.nome, p2.idade);
        p2.mostraDados();

        Pessoa p3 = new Pessoa();
        p3.mostraDados();

        Pessoa p4 = new Pessoa("Cicrano de tal", 42);
        p4.mostraDados();

        
    }
}
