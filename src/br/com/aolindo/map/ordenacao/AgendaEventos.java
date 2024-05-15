package br.com.aolindo.map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

	private Map<LocalDate, Evento> eventosMap = new HashMap<LocalDate, Evento>();

	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		eventosMap.put(data, new Evento(nome, atracao));
	}

	public void exibirAgenda() {
		// O TreeMap organiza a colecao em ordem crescente
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
			LocalDate dataEvento = entry.getKey();
			Evento evento = entry.getValue();
			System.out.println(
					"Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
		}
	}

	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximaData = null;
		Evento proximoEvento = null;
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
			if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				proximaData = entry.getKey();
				proximoEvento = entry.getValue();
				System.out.println("O proximo evento: " + proximoEvento + " acontecerá na data: " + proximaData);
				break;
			}
		}
	}
}
