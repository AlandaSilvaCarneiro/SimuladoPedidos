package br.proj.java.Entitys;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Pedido_Tb")
@Data
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private Cliente idCliente;

    private List<Produto> produtosPedidos;

    private LocalDateTime dataHoraPedido;

    private StatusPedidos statusPedidos;

    private BigDecimal valorTotalPedidos;





}
