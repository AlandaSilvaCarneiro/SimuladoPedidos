package br.proj.java.Entitys;

public enum StatusPedidos {
    ACEITO  ("ACEITO"),
    CANCELADO("CANCELADO"),
    FINALIZADO("FINALIZADO");

    private final String valor;

    StatusPedidos(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    // converter de String para enum
    public static StatusPedidos fromValor(String valor) {
        for (StatusPedidos status : StatusPedidos.values()) {
            if (status.valor.equalsIgnoreCase(valor)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Valor inválido para Status do Pedido.: " + valor);
    }
}
