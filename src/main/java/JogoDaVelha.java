public class JogoDaVelha {

    public static void main(String[] args) {

        String[][] tabuleiro={

            {"","",""},
            {"","",""},
            {"","",""},

        };

        imprimirTabuleiro(tabuleiro);

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
