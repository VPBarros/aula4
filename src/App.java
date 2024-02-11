import java.util.Locale;
import java.util.Scanner;

public class App {

    //Logica de programação, Estrutura repetitiva (while) 
		//fazer um programa para ler um numero indeterminados de dados, contendo cada um a idade de um individuo,imprimindo a Media de idade do grupo.
		//o ultimo dado, nãoo entrará nos calculo,terá um valor de idade negativa.
		// Calcular e imprimi a idade media deste grupo.Se for negativo mostrar mensagem"impossivel calcular"
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int idade = sc.nextInt();
		int soma = 0;
		int contar =0;
		while(idade >= 0){
			soma = soma + idade;
			contar = contar + 1;
			idade = sc.nextInt();	
		}
		if(contar > 0){
			double media = (double)soma / contar;
			System.out.printf("%.2f%n", media);
		}
		else {
			System.out.println("Impossivel Calcular");
		}	
			
         sc.close();

    }
}
