package exemplo04_collections;

import java.util.Arrays;
import java.util.List;

public class Exemplo {

	public static void main(String[] args) {
		List<String> clientes = Arrays.asList("Alice", "Dênis", "Mayra", "Tatiana", "Ana", "Jaison");
		
		clientes
		.stream()
		.filter(cliente -> cliente.startsWith("A"))
		.forEach(System.out::println);
	}
	
}
