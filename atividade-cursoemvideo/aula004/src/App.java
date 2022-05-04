public class App {
    public static void main(String[] args) throws Exception {

        Caneta c1 = new Caneta("Nic", "Preto", 0.4f);

        //c1.setModelo("BIC");
        //c1.modelo = "BIC";

        //c1.setPonta(0.5f);
        //c1.ponta = 0.5f;

        /*System.out.printf("tenho uma caneta %s de ponta %.2f ", c1.getModelo(), c1.getPonta());*/
        c1.status();

        Caneta c2 = new Caneta("kkk", "Rosa", 0.5f);
        c2.status();
        
    }
}
