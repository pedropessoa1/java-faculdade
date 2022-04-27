public class App {
    public static void main(String[] args) throws Exception {

        Celular c1 = new Celular();

        c1.cor = "Preto";
        c1.modelo = "Moto G";
        c1.tam = 15;
        c1.ligado = false;

        c1.status();
        c1.ligar();

        Celular c2 = new Celular();

        c2.cor = "Azul";
        c2.modelo = "Iphone";
        c2.tam = 15;
        c2.ligado = true;

        System.out.println("\n===================");
        c2.status();
        c2.ligar();

    }
}
