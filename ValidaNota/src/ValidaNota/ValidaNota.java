package ValidaNota;
import java.util.Scanner;

public class ValidaNota {
	public static void main (String[]args) {

		float vOperacao = 0;		
		float vNumero1, vNumero2, vNumero3, vNumero4 = 0;
		String vNome;
		
		Scanner entrada  = new Scanner(System.in);
		
		System.out.printf("Digite o nome do aluno: \n");
		vNome = entrada.nextLine();

		System.out.printf("Digite a nota de PORTUGUES: \n");
		vNumero1 = entrada.nextInt();
		System.out.printf("Digite a nota de FILOSOFIA: \n");
		vNumero2 = entrada.nextInt();
		System.out.printf("Digite a nota de MATEMATICA: \n");
		vNumero3 = entrada.nextInt();
		System.out.printf("Digite a nota de FISICA: \n");
		vNumero4 = entrada.nextInt();
		
		vOperacao = ((vNumero1 + vNumero2 + vNumero3 + vNumero4) / 4);
		
		System.out.printf("A MÉDIA DO ALUNO("+vNome+") É: "+vOperacao);
		
		
		
}	
	}