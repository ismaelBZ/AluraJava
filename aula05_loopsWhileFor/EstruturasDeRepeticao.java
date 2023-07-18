package aula05_loopsWhileFor;

public class EstruturasDeRepeticao {

    public static void main(String[] args) {

        /* WHILE couter (1 - 10) */
        int counter = 1;
        while (counter <= 10) {
            System.out.print(counter + " ");
            counter++;
        }

        System.out.println();

        /* FOR ENCADEADO */

        for (int linha = 1; linha <= 10; linha++) {
            for( int coluna = 1; coluna <= 10; coluna++) {
                if (coluna <= linha) {
                    System.out.print(coluna + " ");
                }
            }
            System.out.println();
        }
    }
}