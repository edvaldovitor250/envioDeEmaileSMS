package com.algaworks.di;
import com.algaworks.di.modelo.*;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorEmail;
import com.algaworks.di.notificacao.NotificadorSMS;
import com.algaworks.di.service.AtivacaoClienteService;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente joao = new Cliente("João","joalao90#gmail.com","32543543");
		Cliente maria = new Cliente("Maria","mariao90#gmail.com","5435746");
		
		Notificador notificador = new NotificadorEmail();
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
	}

}
