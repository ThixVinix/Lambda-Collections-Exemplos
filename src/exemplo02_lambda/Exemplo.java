package exemplo02_lambda;

import java.util.Arrays;
import java.util.List;

public class Exemplo {

	public static void main(String[] args) {
		List<Integer> notas = Arrays.asList(7, 6, 5, 8, 10);
		
		notas.forEach(n -> {
			if (n >= 7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
		});
	}

}
