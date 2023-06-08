package aula02_understandingNumbers;

public class IntFloatDoubleCast {

    public static void main(String[] args) {

        int integerNumber = 1;
        System.out.println(integerNumber);

        double realNumber = 2.0;
        System.out.println(realNumber);

        double promotion = 3;
        System.out.println(promotion); // When an integer as typed as a duble in programming we call promotion

        // Casting numbers - force a number type in another number type
        int castedNumber = (int) 4.0;
        System.out.println(castedNumber);

        // Java recognize floating numbers as doubles, so need to cast them or describe
        // it with letter f after the number
        float pi = (float) 3.14159;
        System.out.println("O valor aproximado de PI é : " + pi);
        float aceleracaoDaGravidadeEmMetrosPorSegundo = 9.80665f;
        System.out.println("A aceleraçao da gravidade da terra é : " + aceleracaoDaGravidadeEmMetrosPorSegundo);

        // Errors on numbers
        double zeroOne = 0.1;
        double zeroTwo = 0.2;
        double notZeroThree = zeroOne + zeroTwo;
        System.out.println("A utilização do tipo double em soma pode gerar um erro : " + notZeroThree);

    }

}