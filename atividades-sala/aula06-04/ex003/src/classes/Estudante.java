package classes;

public class Estudante {
    public String nomeAlu;
    public double nota1, nota2, nota3;

    public double notafinal(){

        double fimNota = ((nota1 * 3)+  (nota2  * 3.5) + (nota3 * 3.5));

        return fimNota;
        
    }

    public double pontoRest(){

        if (notafinal() >= 60 ){
            System.out.println("Voce passou PARABENS");
            return 0;
        }

        else {
            System.out.println("Voce reprovou ");
            System.out.println("Falta ");
            return 60 - notafinal();
        }

            //60-notafinal
    }
}
