package aula02_understandingNumbers;

public class IntFloatDoubleCast {

    public static void main(String[] args) {

        int integerNumber = 1;
        System.out.println(integerNumber);

        double realNumber = 2.0;
        System.out.println(realNumber);

        double promotion = 3;
        System.out.println(promotion); // When an integer as typed as a duble in programming we call promotion

        // Casting numbers - force a number type in another number type with less bytes
        int castedNumber = (int) 4.0; // 4.0 is a double and is casted in an integer
        System.out.println(castedNumber);

        // Java recognize floating numbers as doubles, so need to cast them or describe
        // it with letter f after the number
        float pi = (float) 3.14159;
        System.out.println("O valor aproximado de PI é: " + pi);
        float aceleracaoDaGravidadeEmMetrosPorSegundo = 9.80665f; // Look at the f letter after number
        System.out.println("A aceleraçao da gravidade da terra é: " + aceleracaoDaGravidadeEmMetrosPorSegundo);

        
        /*  ERRORS  ERRORS  ERRORS */

        //Compile Error
        // int integerValue = 1.0  // It will not compile because java can't storage a double value (8 bytes) in an integer type (4 bytes). If its necessarie, can be done with casting.
        
        //Operation Error
        double division = 5 / 2;
        System.out.println(division); // That occurs because java realize the two integers division and return and casted integer as a division too, after that value is assigned to the double variable

        // Errors on numbers
        double zeroOne = 0.1;
        double zeroTwo = 0.2;
        double notZeroThree = zeroOne + zeroTwo;
        System.out.println("A utilização do tipo double em soma pode gerar um erro: " + notZeroThree);

    }   

}