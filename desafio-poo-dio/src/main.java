import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descricao Curso java");
        curso1.setCargaHoraria(4);

        Curso curso2= new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descricao Curso js");
        curso2.setCargaHoraria(2);

        Mentoria m1 = new Mentoria();
        m1.setTitulo("Mentoria java");
        m1.setDescricao("Descricao Mentoria java");
        m1.setData(LocalDate.now());

        Mentoria m2 = new Mentoria();
        m2.setTitulo("Mentoria js");
        m2.setDescricao("Descricao Mentoria js");
        m2.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(m1);
//        System.out.println(m2);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descricao Bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(m1);

        Dev dev1 = new Dev();
        dev1.setNome("Vanderson ");
        dev1.inscreverConteudo(bootcamp);
        System.out.println("Conteudos iscritos "+dev1.getNome()+": "+ dev1.getConteudosIscrito());
        System.out.println("_________");
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos iscritos "+dev1.getNome()+": "+ dev1.getConteudosIscrito());
        System.out.println("Conteudos Concluidos "+dev1.getNome()+": "+ dev1.getConteudosConcluidos());
        System.out.println("XP: "+ dev1.calcularXp());

        System.out.println("-----------------------------------------------------------------");
        Dev dev2 = new Dev();
        dev2.setNome("Joao ");
        dev2.inscreverConteudo(bootcamp);
        System.out.println("Conteudos iscritos "+dev2.getNome()+": "+ dev2.getConteudosIscrito());
        System.out.println("_________");
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos iscritos "+dev2.getNome()+": "+ dev2.getConteudosIscrito());
        System.out.println("Conteudos Concluidos "+dev2.getNome()+": "+ dev2.getConteudosConcluidos());
        System.out.println("XP: "+ dev2.calcularXp());

        System.out.println();
    }
}
