public class wife {
    
    
    String nome;
    String senha;
    String sinal;
    int dist;
    boolean conectado;

    void status(){

        System.out.printf("\nO nome do wife é %s",this.nome );
        System.out.printf("\nA senhar do wife é %s",this.senha );
        System.out.printf("\no sinal do wife é %s",this.sinal );
        System.out.printf("\nA distancia do wife é %d",this.dist );
        System.out.printf("\nVoce esta com net ? %b ", this.conectado);
    }

    void conect(){
            if(conectado == true ){

                System.out.println("\nESTA CONECTADO PODE USAR ");
            }
        else{
            System.out.println("\nERRO SEM NET");
        }
    }
    


}
