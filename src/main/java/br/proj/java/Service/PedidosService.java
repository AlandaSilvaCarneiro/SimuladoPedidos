package br.proj.java.Service;


import br.proj.java.Entitys.Pedido;
import br.proj.java.Repository.PedidosRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@Data

public class PedidosService {
    @Autowired
    private PedidosRepository pedidosRepository;



    public List<Pedido> getAllPedidos(){
        return pedidosRepository.findAll();
    }
}
