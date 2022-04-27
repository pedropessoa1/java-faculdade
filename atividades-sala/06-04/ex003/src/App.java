import java.util.Scanner;
import classes.Estudante;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Estudante e1 = new Estudante();

        System.out.println("Digite o nome do aluno: ");
                e1.nomeAlu = sc.next();
        System.out.println("Digite a nota 1 ");
                e1.nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2 ");
                e1.nota2 = sc.nextDouble();
        System.out.println("Digite nota 3");
                e1.nota3 = sc.nextDouble();
        
        System.out.println(e1.notafinal());   
        System.out.println(e1.pontoRest());   

        
        
        
    }
}
