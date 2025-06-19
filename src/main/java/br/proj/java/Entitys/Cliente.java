package br.proj.java.Entitys;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;
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

    @OneToMany(mappedBy = "idCliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Pedido> pedidosCliente;

    private String cpfCliente;
}
