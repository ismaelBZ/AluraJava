package aula04_estruturaCondicional;

public class IfElse {

    public static void main(String[] args) {

        int idade = 16;
        int numeroDeAcompanhantes = 1;
        boolean estahAcompanhado = numeroDeAcompanhantes > 0; // Comparison operators return true or false. Because that it can be used in boolean variables

        if (idade > 18 || estahAcompanhado) {
            System.out.println("Boa festa, sinta-se em casa!");
        } else {
            System.out.println("Volte acompanhado!");
        }
    }
}