/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.util.Date;

/**
 *
 * @author Edgar
 */
public class Produto {
    private Integer codigo;
    private int quantidade;
    private Double preco;
    private String Lote;
    private Date validade;
    private String nome;

    public Produto() {
    }
/*
    public Produto(Integer codigo, int quantidade, Double preco, String Lote, Date validade) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
        this.Lote = Lote;
        this.validade = validade;
    }*/
    
    public Produto(Integer codigo, int quantidade, Double preco, String Lote, Date validade, String nome) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
        this.Lote = Lote;
        this.validade = validade;
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    
    public void QuantidadeAdd(int qtd){
        quantidade = quantidade + qtd;
    }
    
    public void QuantidadeRemove(Integer qtd){
        this.quantidade -= qtd;
    }

    /*public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }*/

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getLote() {
        return Lote;
    }

    public void setLote(String Lote) {
        this.Lote = Lote;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
