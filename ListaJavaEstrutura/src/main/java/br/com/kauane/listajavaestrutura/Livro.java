/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.kauane.listajavaestrutura;

/**
 *
 * @author kauan
 */
public class Livro {
    
    String titulo;
    String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString(){
        return "Livro "+
                "Titulo = " + titulo + "\n"+
                "Autor = " + autor;
    }
    
    
}
