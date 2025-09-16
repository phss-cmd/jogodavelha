import java.security.KeyStore;
import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        String[][] tabuleiro={

            {"","",""},
            {"","",""},
            {"","",""},

        };

        Scanner sc = new Scanner(System.in);

        String jogador = "x";

        while (true){

            imprimirTabuleiro(tabuleiro);

            System.out.println("Jogador " + jogador);
            System.out.println(" Digite a linha e coluna desejada!!!");
            int linha = sc.nextInt();
            int coluna = sc.nextInt();

            if(linha <1 || linha >3){
                continue;
            }

            if(coluna <1 || coluna >3){
                continue;
            }

            if (!tabuleiro[linha -1][coluna -1].isBlank()){

                System.out.println("Posição informada já preenchida, Escolha uma em branco!");
                    continue;

            }

        }



    }

    private static void imprimirTabuleiro(String[][] tabuleiroMostar){

        for (int linha = 0; linha <=2;linha++){

            for (int coluna = 0; coluna <=2; coluna++){

                System.out.print(tabuleiroMostar[linha][coluna]+" | ");

            }

            System.out.println( );

        }

    }

}
