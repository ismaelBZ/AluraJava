public class Programa {
	public static void main(String[] args) {
		System.out.println("run again again again");
	}
}

/* Quando for executar o programa pelo terminal o java se encarrega de encontrar o arquivo
 * .class mas o caminho deste arquivo, se não estiver na mesma pasta deve ser informado ao java.
 * Diante disso existem duas situações:
 * 
 * 		- Estar fora do package: 
 * 			- Neste caso é necessário informar o --classpath ou -cp até o package
 * 
 * 		- Estar dentro do package mas fora da pasta onde esta o arquivo .class:
 * 			- precisa informar o caminho da classe dentro do pacote, separando os níveis por pontos
 * 
 * Nesse caso executei o Programa de fora da pasta aula01 dentro da pasta java, para isso precisei inserir no prompt
 * 		
 * 		java -cp aula01_primeiroPrograma Programa
 * 
 */

 