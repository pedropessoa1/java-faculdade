package classes;

public class Produto {

    public double codigo, qtd, valor, resul1, resul2, resultotal;

    public double valortotal(){

        resul1 = (valor * qtd);

        resul2 = (valor * qtd);
        resultotal = (resul1 + resul2);

        return resultotal;
    }
}
