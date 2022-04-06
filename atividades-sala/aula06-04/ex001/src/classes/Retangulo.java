package classes;

public class Retangulo {

    public double altura, largura;

    public double area(){


         double valoraltura = (altura * largura);

        return valoraltura ;

    }

    public double perimetro(){

        double valorperimetro = (largura + largura + altura + altura );

        return valorperimetro;
    }
    //                2           2
    // raiz de  altura  + largura
// Math.pow(altura, 2)        Math.sqrt()
    public double diagonal(){

        double valordiagonal = ( Math.sqrt( Math.pow(altura,2) + Math.pow(largura, 2)));

        return valordiagonal;
    }
    
    
}
