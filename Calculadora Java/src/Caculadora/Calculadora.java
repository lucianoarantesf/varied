package Caculadora;
import java.util.Scanner;

public class Calculadora {
	public static void main (String[]args) {
		
	int vOperacao = 0;		
	float vNumero1, vNumero2, vResultado = 0;
	
	
	Scanner entrada  = new Scanner(System.in);
	
	System.out.printf("Escolha:\n");
	System.out.printf("Para Soma: 1\nPara Subtra��o: 2\nPara Multiplica��o: 3\nPara Divis�o: 4\n");
	vOperacao = entrada.nextInt();
	
	
	System.out.printf("Muito bem, Agora digire os valores.\n");
	
	
	
	System.out.printf("Digite o primeiro valor:\n");
	vNumero1 = entrada.nextFloat();
	
	System.out.printf("Agora digite o segundo valor:\n");
	vNumero2 = entrada.nextFloat();
	
	
	switch (vOperacao) {
	case 1:
		vResultado = vNumero1 + vNumero2;
		System.out.printf("A Soma de "+vNumero1+" + "+vNumero2+" �:"+vResultado);
		break;
	case 2:
		vResultado = vNumero1 - vNumero2;
		System.out.printf("A Subtra��o de "+vNumero1+" - "+vNumero2+" �:"+vResultado);
		break;
	case 3:
		vResultado = vNumero1 * vNumero2;
		System.out.printf("A Multiplica��o de "+vNumero1+" * "+vNumero2+" �:"+vResultado);
		break;
	case 4:
		vResultado = vNumero1 / vNumero2;
		System.out.printf("A Divis�o de "+vNumero1+" � "+vNumero2+" �:"+vResultado);
		break;
	default:
		System.out.printf("Op��o n�o encontrada");
		break;
	}
	
	}
	

}
