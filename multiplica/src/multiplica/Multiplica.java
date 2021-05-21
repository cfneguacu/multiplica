package multiplica;

import java.math.BigInteger;

public class Multiplica {

	public static void main(String[] args) {
		

		int i = 1;
		//int aux = 1;
		int num = 3;
		int multi = 100;
		
		BigInteger aux = BigInteger.ONE;

			
					do{
						
					aux = aux.multiply(BigInteger.valueOf(num*i));
					
					i++;
					
					}while(num*i<=multi);
					
					
					
					System.out.print ("numero de ciclos "+i);
					
					System.out.println();
					
					System.out.print ("Valor da multiplicação dos multiplos de 3 dentro do intervalo: " + aux);
		
	}

}
