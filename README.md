# Collections em Java

As coleções em Java são estruturas de dados que permitem armazenar e manipular grupos de elementos de forma eficiente. Existem várias interfaces e implementações de coleções disponíveis na biblioteca padrão do Java, cada uma adequada para diferentes tipos de operações e requisitos de armazenamento. As três principais interfaces de coleções são List, Set e Map.

## List
A interface List é uma coleção ordenada que permite elementos duplicados. Os elementos em uma lista são acessados por meio de um índice baseado em zero. Algumas implementações comuns da interface List são ArrayList, LinkedList e Vector.

Exemplo:
```java 
import java.util.ArrayList;

List<Tarefa> tarefas = new ArrayList<>();
tarefas.add("Estudar List");
tarefas.add("Estudar Set");
tarefas.add("Estudar Map");

for (Tarefa tarefasList : tarefas) {
    System.out.println(tarefasList);
}
````
## Set
A interface Set representa uma coleção que não permite elementos duplicados e não garante uma ordem específica para seus elementos. Existem várias implementações de Set, como HashSet, LinkedHashSet e TreeSet.

Exemplo:
```java
import java.util.HashSet.

Set<Convidado> convidados = new HashSet<>();
convidados.add(1);
convidados.add(2);
convidados.add(3);
convidados.add(2); // Não será adicionado, pois o conjunto não permite duplicatas

for (Convidado convidadosSet : convidados) {
    System.out.println(convidadosSet);
}
````
## Map
A interface Map representa uma coleção de pares chave-valor, onde cada chave é única e mapeia para um único valor. As implementações comuns de Map incluem HashMap, LinkedHashMap, TreeMap e Hashtable.

Exemplo:
```java
import java.util.HashMap;

Map<String, Integer> agendaContatoMap = new HashMap<>();
agendaContatoMap.put("Alice", 123456789);
agendaContatoMap.put("Bob", 987654321);
agendaContatoMap.put("Carol", 1122334455);

System.out.println(agendaContatoMap.get("Bob")); // Saída: 987654321
