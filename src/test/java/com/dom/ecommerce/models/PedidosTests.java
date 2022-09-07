package com.dom.ecommerce.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PedidosTests {

	@Test
	void validarPropriedades() {

		var pedido = new Pedido();
		var data = LocalDateTime.now();
		pedido.setCliente(1);
		pedido.setValorTotal(33.33);
		pedido.setdata(data);

	

		assertEquals(1, pedido.getCliente(());
		assertEquals(33.33, pedido.getValorTotal());
		assertEquals(data, pedido.getData());

	}

}
