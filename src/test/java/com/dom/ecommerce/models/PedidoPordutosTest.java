package com.dom.ecommerce.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PedidoPordutosTest {

	@Test
	void validarPropriedades() {

		var pedidoProduto = new PedidoProduto();
		var data = LocalDateTime.now();
		pedidoProduto.setIdPedido(1);
		pedidoProduto.setIdProduto(33.33);
		pedidoProduto.setQuantidade(data);
		pedidoProduto.setValor(data);

	

		assertEquals(1, pedidoProduto.getCliente(());
		assertEquals(33.33, pedidoProduto.getValorTotal());
		assertEquals(data, pedidoProduto.getData());

	}

}
