public class App {
    public static void main(String[] args) throws Exception {
        
        Caneta c1 = new Caneta();
        c1.modelo = "bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 10;
        c1.destampar();
       
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();

        c2.modelo = "compacy";
        c2.cor = "ROSA";
        c2.ponta = 0.8f;
        c2.carga = 50;
        c2.tampar();
       
        System.out.println("\n====================");
        c2.status();
        c2.rabiscar();
       


    }
}
