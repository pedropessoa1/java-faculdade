package classes;

public class empregado {

    public String nome;
    public double salario_bruto, imposto, porcentagemDeAumento, porcentagem;

    public double salarioLiquido(){

        double valorliquido = salario_bruto - ((salario_bruto * imposto)/100);

        return valorliquido;
    }

    public double imcrementoSalarial(){

        double valorAumento = (porcentagem + (salario_bruto * porcentagemDeAumento));

        return valorAumento;
    }


    
    
}
