package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.Produto;
import com.algaworks.di.notificacao.Notificador;

public class EmissaoNotaFiscalSerive {

	private Notificador notificador;

	public EmissaoNotaFiscalSerive(Notificador notificador) {
		this.notificador = notificador;
	}

	public void emitir(Cliente cliente, Produto produto) {
		// TODO emite a nota fiscal aqui...

		this.notificador.notificar(cliente, "Nota fiscal do produto" + produto.getNome() + "foi emitida!");

	}

}
