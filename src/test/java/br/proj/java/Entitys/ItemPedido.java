package br.proj.java.Entitys;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;


@Entity
@Table(name = "ItemPedido")
@Data
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private List<Produto> itemProduto;
    private BigDecimal precoItem

}
