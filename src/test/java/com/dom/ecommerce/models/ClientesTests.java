package com.dom.ecommerce.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClientesTests {

	@Test
	void validarPropriedades() {

		var cliente = new Cliente();

		cliente.setNome("Guilherme");
		cliente.setEmail("guilherme@teste.com");
		cliente.setSenha("123456");
		cliente.setEndereco("Rua Teste");
		cliente.setNumero("T7");
		cliente.setCep("0000-000");
		cliente.setCidade("Recife");
		cliente.setBairro("Boa Vista");
		cliente.setEstado("PE");
		cliente.setComplemento("Casa 7");

		assertEquals("Guilherme", cliente.getNome());
		assertEquals("guilherme@teste.com", cliente.getEmail());
		assertEquals("123456", cliente.getSenha());
		assertEquals("Rua Teste", cliente.getEndereco());
		assertEquals("T7", cliente.getNumero());
		assertEquals("0000-000", cliente.getCep());
		assertEquals("Recife", cliente.getCidade());
		assertEquals("Boa Vista", cliente.getBairro());
		assertEquals("PE", cliente.getEstado());
		assertEquals("Casa 7", cliente.getComplemento());
	}

}
