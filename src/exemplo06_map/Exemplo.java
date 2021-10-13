package exemplo06_map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(2, 4, 6, 8, 10);
		
		//REALIZAR CALCULO:
		List<Integer> listaNova = numeros.stream()
				.map(n -> n * 2)
				.collect(Collectors.toList());
		
		//EXIBIR NUMEROS:
		System.out.println(listaNova);
		
	}

}
