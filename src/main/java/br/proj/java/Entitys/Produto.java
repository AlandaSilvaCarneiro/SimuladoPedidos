package br.proj.java.Entitys;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "Produto_TB")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String nomeProduto;

    private CategoriaProduto categoriaProduto;

    private BigDecimal precoProduto;

    private Integer estoque;

    @ManyToMany(mappedBy = "produtosPedidos")
    private Set<Pedido> produtoPedido;

}
