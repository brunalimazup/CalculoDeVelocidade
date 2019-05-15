package calculovelocidade;
import java.util.Scanner;
public class app { 
	public static void main(String[] args) {
		Scanner calculo = new Scanner(System.in);
		
		System.out.println ("Qual a velocidade?");
		float velocidade = calculo.nextFloat();
		
		System.out.println("Qual o tempo gasto na viagem?");
        float tempo = calculo.nextFloat();
        
        float distancia = velocidade*tempo;
        
		float litrosUsados = distancia/12;
		System.out.println("Total de litros gastos na viagem:" + litrosUsados);
		
	}

}
