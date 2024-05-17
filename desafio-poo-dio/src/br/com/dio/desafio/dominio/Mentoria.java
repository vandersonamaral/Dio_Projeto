package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria  extends Conteudo{
    private LocalDate data;

//    public Mentoria(String titulo, String descricao) {
//        this.titulo = titulo;
//        this.descricao = descricao;
//        this.data = LocalDate.now();
//    }

    @Override
    public double calcularXp() {

        return XP_PADRAO +20;
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
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getTitulo() + '\'' +
                ", data=" + data +
                '}';
    }
}
