# Collections em Java

As coleções em Java são estruturas de dados que permitem armazenar e manipular grupos de elementos de forma eficiente. Existem várias interfaces e implementações de coleções disponíveis na biblioteca padrão do Java, cada uma adequada para diferentes tipos de operações e requisitos de armazenamento. As três principais interfaces de coleções são List, Set e Map.

## List
A interface List é uma coleção ordenada que permite elementos duplicados. Os elementos em uma lista são acessados por meio de um índice baseado em zero. Algumas implementações comuns da interface List são ArrayList, LinkedList e Vector.

Exemplo:
```java
import java.util.ArrayList;
public class Tarefa {
	private String descricao;

	public Tarefa(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
}

public static void main(String[] args) {

	List<Tarefa> tarefas = new ArrayList<>();
	tarefas.add(new Tarefa("Estudar List"));
	tarefas.add(new Tarefa("Estudar Set"));
	tarefas.add(new Tarefa("Estudar Map"));

	for (Tarefa tarefasList : tarefas) {
	     System.out.println(tarefasList.getDescricao());
	}

}
````
## Set
A interface Set representa uma coleção que não permite elementos duplicados e não garante uma ordem específica para seus elementos. Existem várias implementações de Set, como HashSet, LinkedHashSet e TreeSet.

Exemplo:
```java
import java.util.HashSet.
public class Convidado {
	private String nome;
	private int codigoConvite;

	public Convidado(String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}
	public String getNome() {
		return nome;
	}
	public int getCodigoConvite() {
		return codigoConvite;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return codigoConvite == other.codigoConvite;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Convidados [nome = ");
		builder.append(nome);
		builder.append(", codigoConvite = ");
		builder.append(codigoConvite);
		builder.append("]");
		return builder.toString();
	}
}

public static void main(String[] args) {

	Set<Convidado> convidados = new HashSet<>();
	convidados.add(new Convidado("Alice", 1));
	convidados.add(new Convidado("Bob", 2));
	convidados.add(new Convidado("Carol", 2)); //Não será adicionado, pois o conjunto não permite codigoConvite duplicato;
		
	for (Convidado convidadosSet : convidados) {
             System.out.println(convidadosSet);
	}

}
````
## Map
A interface Map representa uma coleção de pares chave-valor, onde cada chave é única e mapeia para um único valor. As implementações comuns de Map incluem HashMap, LinkedHashMap, TreeMap e Hashtable.

Exemplo:
```java
import java.util.HashMap;

public static void main(String[] args) {

	Map<String, Integer> agendaContatoMap = new HashMap<>();
	agendaContatoMap.put("Alice", 123456789);
	agendaContatoMap.put("Bob", 987654321);
	agendaContatoMap.put("Carol", 1122334455);

	System.out.println(agendaContatoMap.get("Bob")); // Saída: 987654321

}
