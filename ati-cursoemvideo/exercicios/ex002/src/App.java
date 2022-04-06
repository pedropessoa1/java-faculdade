public class App {
    public static void main(String[] args) throws Exception {
        
        wife w1 = new wife();

        w1.nome = "Pedronet";
        w1.senha = "123";
        w1.sinal = "Forte";
        w1.dist = 2;
        w1.conectado = false;

        w1.status(); 
        w1.conect();


    }
}
