import java.util.Scanner;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();



         System.out.printf("Digite seu nome: ");
            p1.Pessoa = sc.next();
        
        System.out.println("Digite o peso: ");
                p1.peso = sc.nextDouble();

        System.out.println("Digite a altura: ");
                p1.altura = sc.nextDouble();

        System.out.println("Seu IMC é %.2f", resulmc);


        
    }
}
