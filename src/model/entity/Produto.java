package model.entity;

import java.math.BigDecimal;

public class Produto {
    private int id_produto;
    private String nome_produto;
    private String tipo_produto;
    private BigDecimal valor_produto;


    // Getters.
    public int getId_produto() { return id_produto; }
    public String getNome_produto() { return nome_produto; }
    public String getTipo_produto() { return tipo_produto; }
    public BigDecimal getValor_produto() { return valor_produto; }

    // Setters.
    public void setId_produto(int id_produto) { this.id_produto = id_produto; }
    public void setNome_produto(String nome_produto) { this.nome_produto = nome_produto; }
    public void setTipo_produto(String tipo_produto) { this.tipo_produto = tipo_produto; }
    public void setValor_produto(BigDecimal valor_produto) { this.valor_produto = valor_produto; }
}
