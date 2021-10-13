package exemplo03_collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exemplo {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(5, 6, 7, 1, 2, 9, 15, -5);

		// ORDENAR VALORES (CRESCENTE):
		Collections.sort(numeros);
		System.out.println("Vetor ordenado (crescente):");
		numeros.forEach(System.out::println);
		
		// ORDENAR VALORES (DECRESCENTE):
		Collections.sort(numeros, Collections.reverseOrder());
		System.out.println("Vetor ordenado (decrescente):");
		numeros.forEach(System.out::println);

	}

}
