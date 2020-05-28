package com.lechuguita.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lechuguita.entities.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
