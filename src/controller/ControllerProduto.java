package controller;

import java.util.Date;

import model.EnviarNotaFiscal;
import model.ItemVenda;
import model.Produto;
import model.Venda;

public class ControllerProduto {

	/* 
	 * TODO 04
	 * 
	 * 1. Implemente os metodos que este controlador deve intermediar
	 * pelos eventos do usuario na classe TelaCadastroProduto (view), 
	 * acionando funcionalidades na classe Produto (model) e, eventualmente,
	 * exibindo resultado desses acionamentos de volta na view. 
	 * 
	 * 2. Para detectar melhor o que este controler deve prover como métodos, 
	 * veja os listeners dispostos na classe TelaCadastroProduto que estão se 
	 * acoplando diretamente com objetos da camada model.
	 *  
	 * 3. Verifique se este controlador pode manter referencias
	 * (como atributos desta classe) para objetos view e /ou model envolvidos.
	 * Se puder, declare-os e utilize-os nas implementacoes dos metodos deste
	 * controlador.
	 * 
	 * */
	
	Produto produto = new Produto();
	Venda venda = new Venda();
	ItemVenda itemVenda = new ItemVenda();
	EnviarNotaFiscal enviarNotaFiscal = new EnviarNotaFiscal();
	
	public void cadastrarProduto(String nomeProduto, float precoProduto) {
		produto.setNome(nomeProduto);
		produto.setPreco(precoProduto);
	}
	
	
	public void cadastrarVenda(Date data) {
		venda.setData(data);
	}
	
	public void CadastrarItemVenda(int quantidade) {
		itemVenda.setProduto(produto);
		itemVenda.setQuantidade(quantidade);
	}
	
	public boolean enviarNotaFiscalPorEmail() {
		return enviarNotaFiscal.enviarNotaFiscalPorEmail(venda);
	}
}
