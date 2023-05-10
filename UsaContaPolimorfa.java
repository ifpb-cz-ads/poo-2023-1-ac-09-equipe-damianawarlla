package atividade9;


    import java.util.Scanner;

public class UsaContaPolimorfa {
    public static void main(String[] args) {
         Conta c = null;
         Cliente c1 = null;
        Scanner scan = new Scanner(System.in);
        int opcao;
        System.out.println("Qual opção voce deseja?");
        System.out.println("1 - criar nova conta");
        System.out.println("2 - sair do menu");
        opcao = scan.nextInt();
        switch (opcao) {
            case 1 :
                System.out.println("Qual tipo de conta vc deseja criar?");
                System.out.println("1 - criar conta especial");
                System.out.println("2 - criar poupança");
                int novaOpcao = scan.nextInt();
                switch(novaOpcao){
                
                    case 1 :
                        c1 = new Cliente("Damiana", null);
                        c = new ContaEspecial(100,c1, 500);
                        break;
                    case 2 :
                        c1 = new Cliente("Warlla", null);
                        c = new ContaPoupanca(105, c1 );
                        break;
                    default :
                        System.out.println("numero invalido");
                }
          }
    }
}
