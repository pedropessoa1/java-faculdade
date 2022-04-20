import java.util.Scanner;
import classes.conta;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        conta c1 = new conta();

        System.out.println("Digite seu nome: ");
            c1.nome = sc.next();
        
    }
}
