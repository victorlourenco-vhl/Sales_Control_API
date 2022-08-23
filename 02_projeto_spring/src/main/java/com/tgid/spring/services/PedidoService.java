package com.tgid.spring.services;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tgid.spring.domain.ItemPedido;
import com.tgid.spring.domain.PagamentoComBoleto;
import com.tgid.spring.domain.Pedido;
import com.tgid.spring.domain.enums.EstadoPagamento;
import com.tgid.spring.repositories.ItemPedidoRepository;
import com.tgid.spring.repositories.PagamentoRepository;
import com.tgid.spring.repositories.PedidoRepository;
import com.tgid.spring.repositories.ProdutoRepository;
import com.tgid.spring.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	@Autowired
	private BoletoService boletoService;

	@Autowired
	private PagamentoRepository pagamentoRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private ItemPedidoRepository itemPedidoRepository;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id 
					+ ", Tip: " + Pedido.class.getName());
		}
		return obj.orElse(null);
	}
	
	
	public Pedido insert(Pedido obj) {
		obj.setId(null);
		obj.setInstante(new Date());
		obj.getPagamento().setEstado(EstadoPagamento.PENDENTE);
		obj.getPagamento().setPedido(obj);
		if (obj.getPagamento() instanceof PagamentoComBoleto) {
			PagamentoComBoleto pagto = (PagamentoComBoleto) obj.getPagamento();
			boletoService.preencherPagamentoComBoleto(pagto, obj.getInstante());
		}
		obj = repo.save(obj);
		pagamentoRepository.save(obj.getPagamento());
		for (ItemPedido ip : obj.getItens()) {
			ip.setDesconto(0.0);
			ip.setPreco(produtoRepository.findById(ip.getProduto().getId()).getPreco());
			ip.setPedido(obj);
		}
		itemPedidoRepository.saveAll(obj.getItens());
		return obj;
	}
	
}
