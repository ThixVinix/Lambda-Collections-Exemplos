package exemplo05_hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exemplo {

	public static void main(String[] args) {
		Set<String> cursos = new HashSet<>();
		
		cursos.addAll(Arrays.asList("Java", "C#", "PHP", "Java", "NodeJS"));
		
		//IGNORA REGISTROS SEMELHANTES
		System.out.println(cursos);
		
	}

}
