package br.proj.java.Controller;


import br.proj.java.Entitys.Pedido;
import br.proj.java.Service.PedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class ControllerPedido {
    @Autowired
    private PedidosService pedidosService;


    @GetMapping()
    public List<Pedido> listaPedidos(){
        return pedidosService.getAllPedidos();
    }
}
