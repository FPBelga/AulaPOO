package Sistema.Venda;

import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto produto1 = new Produto();
		
		produto1.setId(1L);
		produto1.setNome("Módulo orientado a objestos");
		produto1.setValor(BigDecimal.valueOf(100));
		
		Produto produto2 = new Produto();
		
		produto2.setId(2L);
		produto2.setNome("Módulo spring");
		produto2.setValor(BigDecimal.valueOf(190));
		
		Produto produto3 = new Produto();
		
		produto3.setId(2L);
		produto3.setNome("Módulo ANGULAR");
		produto3.setValor(BigDecimal.valueOf(300));
		
		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Java");
		venda.setEnderecoEntrega("Entrega pelo email");
		venda.setId(10L);
		venda.setNomeCliente("Felipe Belga");
		venda.setValorTotal(BigDecimal.valueOf(197.00));
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		venda.addProduto(produto3);
		
		for (Produto produto : venda.getListaProdutos()) {
			System.out.println("Descrição produto " + produto);
		}
		
		System.out.println("Descrição Venda: " + venda.getDescricaoVenda() + "e total: " 
											   + venda.getValorTotal());
	}

}
