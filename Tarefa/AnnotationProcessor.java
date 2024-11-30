package Tarefa;

public class AnnotationProcessor {

	public static void processarTabela(Class<?> clazz) {

		if (clazz.isAnnotationPresent(Tabela.class)) {

			Tabela tabela = clazz.getAnnotation(Tabela.class);

			System.out.println("Nome da tabela: " + tabela.value());
		} else {

			System.out.println("A classe " + clazz.getName() + " não tem annotation @Tabela.");
		}

	}

}
