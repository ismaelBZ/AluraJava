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
            for( int coluna = 1; coluna <= linha; coluna++) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int number = 3; number < 100; number = number + 3) {
            System.out.print(number + " ");
        }

        System.out.println();
        
        int factorial = 1;
        int whatFactorial = 6;
        if (whatFactorial == 0) {
            factorial = 1;
        } else {
            for (int iterator = 1; iterator <= whatFactorial; iterator++) {
                    factorial *= iterator;
                    System.out.println(factorial);
            }
        }
        System.out.println(factorial);
    }
}