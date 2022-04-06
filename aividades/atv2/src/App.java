import java.util.Scanner;
import classes.Calculo;

public class App {
    public static void main(String[] args) throws Exception {

        

        Scanner sc = new Scanner(System.in);

        Calculo c1 = new Calculo();

        System.out.println("Digite o valor para A: ");
            c1.a = sc.nextInt();
        System.out.println("Digite o valor para B: ");
            c1.b = sc.nextInt();
        System.out.println("Digite o valor para C: ");
            c1.c = sc.nextInt();
        System.out.println("Digite o valor para D: ");
            c1.d = sc.nextInt();

        //int valor = c1.valores();
        int resul = c1.valores();

        System.out.printf("Resultado deu %d", resul);
        
    }
}
