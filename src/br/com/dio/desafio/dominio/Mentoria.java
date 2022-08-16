package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

    private String titulo;
    private String desricao;
    private LocalDate data;

    public Mentoria(){

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesricao() {
        return desricao;
    }

    public void setDesricao(String desricao) {
        this.desricao = desricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", desricao='" + desricao + '\'' +
                ", data=" + data +
                '}';
    }
}
