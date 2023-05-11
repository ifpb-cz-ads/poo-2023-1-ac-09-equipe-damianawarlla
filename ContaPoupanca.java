package atividade9;

public class ContaPoupanca extends Conta{

    
   
   public ContaPoupanca(int numero,Cliente titular){

        super(numero,titular);

   }

    public void rejustar(double percentual){
        saldo = saldo * percentual;
    }

    @Override
    public boolean sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            return true;
        } else{
            return false;
        }
    }
}
