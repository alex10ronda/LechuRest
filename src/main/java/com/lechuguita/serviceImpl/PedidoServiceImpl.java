package com.lechuguita.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lechuguita.dao.PedidoRepository;
import com.lechuguita.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	private PedidoRepository pedidoRepo;
	
	
	public void nuevoPedido() {
		// TODO Auto-generated method stub
		
	}

}
