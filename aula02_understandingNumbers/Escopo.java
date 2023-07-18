package aula02_understandingNumbers;

public class Escopo {

    public static void main(String[] args) {

        int idade = 17;
        boolean estahAcompanhado;
        int numeroDeAcompanhantes = 2;

        // VERIFICAR SE ESTAH ACOMPANHADO
        if (numeroDeAcompanhantes > 0) {
            estahAcompanhado = true; // A definição da variavel foi feita fora do bloco, por isso seu valor sera
                                     // alterado fora do bloco
        } else {
            estahAcompanhado = false;
        }

        // EXECUCAO DO CODIGO COM O VALOR ATRIBUIDO A VARIAVEL BOOLEANA estahAcompanhado
        if (idade >= 18 || estahAcompanhado) {
            System.out.println("Se divirta! Pode entrar!");
        } else {
            System.out.println("Volte acompanhado!");
        }
    }
}