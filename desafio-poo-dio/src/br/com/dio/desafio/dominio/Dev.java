package br.com.dio.desafio.dominio;


import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosIscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverConteudo(Bootcamp bootcamp) {
        this.conteudosIscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevs().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosIscrito.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosIscrito.remove(conteudo.get());
        } else
            System.out.println("Voce nao esta matriculado em nenhum conteudo");
    }

    public double calcularXp() {
        return conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosIscrito() {
        return conteudosIscrito;
    }

    public void setConteudosIscrito(Set<Conteudo> conteudosIscrito) {
        this.conteudosIscrito = conteudosIscrito;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosIscrito, dev.conteudosIscrito) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosIscrito, conteudosConcluidos);
    }
}
