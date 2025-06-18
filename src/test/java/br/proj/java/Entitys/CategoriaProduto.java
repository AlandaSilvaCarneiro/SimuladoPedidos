package br.proj.java.Entitys;

public enum CategoriaProduto {
    BEBIDA  ("BEBIDA"),
    COMIDA("COMIDA"),
    ELETRONICO("ELETRONICO"),
    ROUPA("ROUPA");

    private final String valor;

    CategoriaProduto(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    // converter de String para enum
    public static CategoriaProduto fromValor(String valor) {
        for (CategoriaProduto categoriaProduto : CategoriaProduto.values()) {
            if (categoriaProduto.valor.equalsIgnoreCase(valor)) {
                return categoriaProduto;
            }
        }
        throw new IllegalArgumentException("Valor inválido para Categoria do Produto: " + valor);
    }
}
