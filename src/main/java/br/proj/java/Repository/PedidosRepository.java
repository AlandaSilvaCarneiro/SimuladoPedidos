package br.proj.java.Repository;

import br.proj.java.Entitys.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PedidosRepository extends JpaRepository<Pedido,UUID> {
}
