import java.util.Scanner; 
import classes.empregado;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        empregado e1 = new empregado();

        System.out.println("Digite o fucionario : ");
                e1.nome = sc.next(); 
                
        System.out.println("Digite o salari: ");
                e1.salario_bruto = sc.nextDouble();
        
        System.out.println("Digite o valor do imposto: ");
                e1.imposto = sc.nextDouble();
        
        System.out.printf("Salario liquido é de: %.2f", e1.salarioLiquido());

        System.out.println("\nDigite o valor da porcentagem do aumento: ");
                e1.porcentagemDeAumento = sc.nextDouble();
        System.out.printf("\nNovo salario de %s é de %.2f", e1.nome, e1.imcrementoSalarial());
    }
}
