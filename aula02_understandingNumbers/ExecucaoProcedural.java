package aula02_understandingNumbers;

public class ExecucaoProcedural {

    public static void main(String[] args) {

        int primeiroNumero = 1;
        int segundoNumero = 2;
        segundoNumero = primeiroNumero;

        primeiroNumero = 3;

        System.out.println(segundoNumero);

        /* A execução no java acontece de forma procedural e assíncrona. */

        /* 
         *  Além disso as varíaveis armazenam valores, não as suas relações, por isso na 
         * execução deste program, foi armazenado o valor da primeira variavel na segunda e 
         * depois, quando atribuimos outro valor a primeira variavel, ele não foi passado para a segunda.
        */
    }
}