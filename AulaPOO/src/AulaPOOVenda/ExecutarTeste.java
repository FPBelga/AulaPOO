package AulaPOOVenda;

import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {
	
		 Produtos produto1 = new Produtos();
		 
		 produto1.setId(1L);
		 produto1.setNome("modulo orienta??o a objetos");
		 produto1.setValor(BigDecimal.valueOf(100));
		 
         Produtos produto2 = new Produtos();
		 
		 produto2.setId(2L);
		 produto2.setNome("modulo de Sprong Boot API Rest");
		 produto2.setValor(BigDecimal.valueOf(100));
		 
         Produtos produto3 = new Produtos();
		 
		 produto3.setId(3L);
		 produto3.setNome("Curso JAVA FULL STACK");
		 produto3.setValor(BigDecimal.valueOf(200));
		
		 Venda venda = new Venda();
		 
		 venda.setDescricaoVenda("Venda de curso forma??o Java");
		 venda.setEnderecoEntrega("Entrega pelo EMAIL");
		 venda.setId(10L);
	     venda.setNomeCliente("Felipe Belga");
	   //  venda.setValorTotal(BigDecimal.valueOf(197.00));
	     
	     venda.getListaProdutos().add(produto1);
	     venda.getListaProdutos().add(produto2); /*Esse metodo n?o consigo valida??es*/
         venda.addProduto(produto3);/*Com esse metodo posso fazer valida??es antes de inserir na lista*/
	        
//	     for (Produtos produto : venda.getListaProdutos()) {
//	    	 System.out.println("Descri??o do Produto : " + produto); 
//	    	 
//	     }
	     
	     
	     System.out.println("Descricao da venda : " + venda.getDescricaoVenda() +
	    		            "e o total da venda : " + venda.totalVenda());
	}

}
