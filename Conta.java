package atividade9;

public abstract class Conta {
    private int numero;
    private Cliente titular;
    protected double saldo;
   


    
    public Conta(int numero, Cliente titular, double saldo){
        
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;

    }

    public Conta(int numero, Cliente titular){
        this.numero = numero;
        this.titular = titular;
    }

  
    
    public void depositar(double valor){
        this.saldo = this.getSaldo() + valor;
    }

    public abstract boolean sacar(double valor);
        
    

    public double getSaldo(){
        return saldo;
    }

    public int getNumero(){
        return numero;
    }

    public Cliente getNome_titular(){
        return titular;
    }

    public void setNome_titular(Cliente titular){
        this.titular = titular;
    }

}

