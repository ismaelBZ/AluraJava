package aula03_charAndString;

public class Strings {

    public static void main(String[] args) {

        char letraAMinuscula = 'a'; // Todo char vai entre aspas simples;
        char letraBMinuscula = 98; // O char também pode ser definido pela numeraçao do seu encoding;
        char letraCMinuscula = (char) (letraBMinuscula + 1); // É necessário fazer o casting, pq int usa 4bytes e o char
                                                             // 2bytes

        System.out.print(letraAMinuscula + " ");
        System.out.print(letraBMinuscula + " ");
        System.out.println(letraCMinuscula + " ");

        String abc = "abc"; // Strings are declareted with upper case first letter and the value is ever between double quotes
        System.out.print(abc);

    }
}