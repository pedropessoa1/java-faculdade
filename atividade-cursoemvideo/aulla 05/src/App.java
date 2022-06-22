import classes.ContaBanco;

public class App {
    public static void main(String[] args) throws Exception {
        
        ContaBanco p1 = new ContaBanco();
        p1.setDono("JUBILEU ");
        p1.setNumConta(1111);
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setDono("FERNANDA" );
        p2.setNumConta(2222);
        p2.abrirConta("CP");
       
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(1000);

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
