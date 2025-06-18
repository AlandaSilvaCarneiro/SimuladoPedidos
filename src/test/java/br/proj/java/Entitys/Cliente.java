package br.proj.java.Entitys;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "Cleinte_TB")
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String Cliente;
    private String emailCliente;
    private List<Pedidos> pedidosCliente;
    private String cpfCliente;
}
