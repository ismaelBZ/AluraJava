package aula03_charAndString;

public class Strings {

    public static void main(String[] args) {

        char letraAMinuscula = 'a'; // Todo char vai entre aspas simples;
        char letraBMinuscula = 98; // O char também pode ser definido pela numeração do encoding UTF-8
        char letraCMinuscula = (char) (letraBMinusculo + 1);  // Quando acontece a soma letraBMinusculo é do tipo char(2Bytes) e 1 é do tipo integer(4bytes), resultando em um número do tipo integer, logo um integer não cabe no tipo char, por isso, é necessário fazer o casting;
                                                             // 2bytes

        System.out.print(letraAMinuscula + " ");
        System.out.print(letraBMinuscula + " ");
        System.out.println(letraCMinuscula + " ");

        String abc = "abc"; // Strings are declareted with upper case first letter and the value is ever between double quotes
        System.out.print(abc);

    }
}