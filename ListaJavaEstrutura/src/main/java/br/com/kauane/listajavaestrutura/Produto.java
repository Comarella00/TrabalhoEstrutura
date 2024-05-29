/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.kauane.listajavaestrutura;

/**
 *
 * @author kauan
 */
public class Produto {
    int codProduto;
    String descricao;
    String dataEntrada;
    String ufOrigem;
    String ufDestino;

    public Produto(int codProduto, String descricao, String dataEntrada, String ufOrigem, String ufDestino) {
        this.codProduto = codProduto;
        this.descricao = descricao;
        this.dataEntrada = dataEntrada;
        this.ufOrigem = ufOrigem;
        this.ufDestino = ufDestino;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codProduto=" + codProduto +
                ", descricao='" + descricao + '\'' +
                ", dataEntrada='" + dataEntrada + '\'' +
                ", ufOrigem='" + ufOrigem + '\'' +
                ", ufDestino='" + ufDestino + '\'' +
                '}';
    }
}
