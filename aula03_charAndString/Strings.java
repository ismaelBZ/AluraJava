package aula03_charAndString;

public class Strings {

    public static void main(String[] args) {

        char letraAMinuscula = 'a'; // Todo char vai entre aspas simples;
        char letraBMinuscula = 98; // O char também pode ser definido pela numeração do encoding UTF-8
        char letraCMinuscula = (char) (letraBMinuscula + 1);  // Quando acontece a soma letraBMinusculo é do tipo char(2Bytes) e 1 é do tipo integer(4bytes), resultando em um número do tipo integer, logo um integer não cabe no tipo char, por isso, é necessário fazer o casting;
                                                             // 2bytes

        System.out.print(letraAMinuscula + " ");
        System.out.print(letraBMinuscula + " ");
        System.out.println(letraCMinuscula);

        String abc = "Uma String sempre vai entre aspas duplas, diferente de um char que vai " 
                        + "sempre dentro de aspas simples. Uma boa prática quando temos Strings "
                        + "muito grandes é separa-las e concatenalas para aumentar a legibilidade "
                        + "dos códigos."; // Strings are declareted with upper case first letter and the value is ever between double quotes
        System.out.print(abc);

    }
}