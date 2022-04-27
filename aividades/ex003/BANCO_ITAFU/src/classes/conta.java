package classes;

public class conta {
    private int numeroCont;
    private String nome;
    private double saldo;

    

    public void deposito(double valor ){
        saldo += valor;

    }

    public void saque(double valor ){
        saldo -= valor + 5.00;
        
    }
}
