package atividade9;
public class ContaEspecial extends Conta {
    
    public String tipoConta = "conta especial";
   
    public ContaEspecial(int numero, Cliente titular, double limite){
        
        super(numero, titular);
    }

   
    private double limite;

    private double getLimite(){
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor){
        if (valor <= this.limite + this.saldo){
            this.saldo -= valor;
            return true;
        } else{
            return false;
        }
    }

}