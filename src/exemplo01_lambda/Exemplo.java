package exemplo01_lambda;

import java.util.Arrays;
import java.util.List;

public class Exemplo {

	public static void main(String[] args) {
		List<String> cores = Arrays.asList("Azul", "Verde", "Amarelo");

		// cores.forEach(cor -> System.out.println(cor));
		cores.forEach(System.out::println);

	}

}
