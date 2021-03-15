package exercicio06.main;
import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			
			Main app = new Main();
			 app.start();
		}
	
			private void start() {
				
				//Scanner ler =new Scanner (System.in);
				
				int quantidade;
				
				
				String [] carros = {"civic","gol","palio","uno", " "};
				
				quantidade = carros.length;
				
				for (int i=0; i < quantidade; i++) {
				
					System.out.println("O carro " + i + " é " + carros[i]);
				
				}
				System.out.println("******************");
				
				carros[1] = "L200";
				
				for(String item : carros) { //joga tudo que estava dentro do vetor carros para o vetor item
				
					System.out.println("O carro "  + "é " + item);
					
				}			
				
				System.out.println("******************");
								
				carros[4] = "gol";
								
				for (int i=0; i < quantidade; i++) {
				
					System.out.println("O carro " + i + " é " + carros[i]);
				
				}
							
				
		}
	
}
