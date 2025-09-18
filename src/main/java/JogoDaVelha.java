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

            tabuleiro[linha -1][coluna -1]=jogador;

            if (jogoFinalizado(tabuleiro, jogador)){
                imprimirTabuleiro(tabuleiro);
                break;
            }

            jogador = jogador.equals("x") ? "o" : "x";
        }
    }

    private static boolean jogoFinalizado(String[][] tabuleiro,String jogador) {
        for (int linha = 0; linha <=2;linha++){
            if (tabuleiro[linha][0]==jogador && tabuleiro[linha][1]==jogador && tabuleiro[linha][2]==jogador) {
                System.out.println("Você ganhou o jogo");
                return true;
            }
        }

        for (int coluna = 0; coluna <=2;coluna++){
            if (tabuleiro[0][coluna]==jogador && tabuleiro[1][coluna]==jogador && tabuleiro[2][coluna]==jogador) {
                System.out.println("Você ganhou o jogo");
                return true;

            }
        }

        if (tabuleiro[0][0]==jogador && tabuleiro[1][1]==jogador && tabuleiro[2][2]==jogador) {
            System.out.println("Você ganhou o jogo");
            return true;

        }

        if (tabuleiro[2][0]==jogador && tabuleiro[1][1]==jogador && tabuleiro[0][2]==jogador) {
            System.out.println("Você ganhou o jogo");
            return true;
        }
        return false;
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
