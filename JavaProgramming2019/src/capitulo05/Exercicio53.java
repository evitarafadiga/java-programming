package capitulo05;

/*
 * Escreva uma instru��o Java ou um conjunto de instru��es Java para realizar cada uma das seguintes tarefas:
	
	a) Some os inteiros �mpares entre 1 e 99 utilizando uma instru��o for. 
		Assuma que as vari�veis de inteiro sum e count foram declaradas.
	
	b) Calcule o valor de 2.5 elevado � pot�ncia de 3, utilizando o m�todo pow.
	
	c) Imprima os inteiros de 1 a 20, utilizando um loop while e a vari�vel contadora i. 
		Assuma que a vari�vel i foi declarada, mas n�o foi inicializada. 
		Imprima apenas cinco inteiros por linha. 
		[Dica: utilize o c�lculo i % 5. 
		Quando o valor dessa express�o for 0, imprima um caractere de nova linha; caso contr�rio, imprima um caractere de tabula��o. 
		Assuma que esse c�digo � um aplicativo. 
		Utilize o m�todo System.out.println () para imprimir o caractere de nova linha, e utilize o m�todo System.out.print ('\t') para
imprimir o caractere de tabula��o.]

	d) Repita a parte (c) utilizando uma instru��o for.

 */

public class Exercicio53 {

	public static void main(String[] args) {
		
		int i = 0;
		while ( i <20) {
			i++;
			System.out.printf("%n%d ",i);
		}
			
		for (int k = 1; k < 20; ++k) {
			System.out.printf("%n%d ",k);
		}
		
		int sum = 1;
		for (int j = -1; j <= 99; j += 2) {
		sum += j;
		System.out.printf("O numero inteiro impar %d%n somado ao restante equivale a %d%n",i,sum);			
		}
		
		double potencia = Math.pow(2.5, 3);
		System.out.printf("%nO resultado da potencia equivale a: %f",potencia);
		
		

	}

}
