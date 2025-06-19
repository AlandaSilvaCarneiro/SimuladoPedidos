package br.proj.java.Entitys;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "Pedido_Tb")
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne()
    @JoinColumn(name = "cliente_id")
    private Cliente idCliente;



    @ManyToMany
    @JoinTable(
            name = "pedido_produto",
            joinColumns = @JoinColumn(name = "pedido_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private Set<Produto> produtosPedidos;

    private LocalDateTime dataHoraPedido;

    private StatusPedidos statusPedidos;

    private BigDecimal valorTotalPedidos;

    private String codigoPedido;





}
