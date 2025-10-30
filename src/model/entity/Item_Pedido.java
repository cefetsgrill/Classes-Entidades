package model.entity;

import java.math.BigDecimal;

public class Item_Pedido {
    private Pedido pedido;
    private Produto produto;
    private int quantidade;
    private BigDecimal preco;

    // Calcula o subtotal do pedido para cada item especifico.
    public BigDecimal calcularSubTotal(){
        if(quantidade < 1 || preco == null){
            return BigDecimal.ZERO;
        }
        return preco.multiply(new BigDecimal(quantidade));
    }

    // Getters.
    public Pedido getPedido() { return pedido; }
    public int getQuantidade() { return quantidade; }

    public Produto getProduto() { return produto; }

    public BigDecimal getPreco() { return preco; }

    // Setters.
    public void setPedido(Pedido pedido) { this.pedido = pedido; }

    public void setProduto(Produto produto) { this.produto = produto; }

    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public void setPreco(BigDecimal preco) { this.preco = preco; }
}
