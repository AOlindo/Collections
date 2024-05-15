package br.com.aolindo.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class EventoTest {

	public static void main(String[] args) {
		
		AgendaEventos agendaEventos = new AgendaEventos();
		
		agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
	    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
	    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
	    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
//	    agendaEventos.adicionarEvento(LocalDate.of(2024, 5, 14), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");
	    agendaEventos.adicionarEvento(LocalDate.of(2024, 5, 31), "Seminário de Java", "Discussão sobre Java avançada");
		
		agendaEventos.exibirAgenda();
		
		System.out.println("-----------------------------------------------------------");
		agendaEventos.obterProximoEvento();
	}
}
