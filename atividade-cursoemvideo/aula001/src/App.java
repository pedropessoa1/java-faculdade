import classes.Caneta;

public class App {
    public static void main(String[] args) throws Exception {
        
        Caneta c1 = new Caneta();
       
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 50;

        //c1.tampar();
        c1.destampar();
        c1.rabiscar();
        c1.status();

        System.out.println("\n--------------------------");
        Caneta c2 = new Caneta();

        c2.modelo = "Bic2";
        c2.modelo = "Preto";
        c2.tampar();
        c2.rabiscar();
        c2.status();

    }
}
