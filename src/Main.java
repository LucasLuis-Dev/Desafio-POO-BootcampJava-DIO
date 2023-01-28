import dio.desafio.POO.Bootcamp;
import dio.desafio.POO.Curso;
import dio.desafio.POO.Dev;
import dio.desafio.POO.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();

        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição Curso Java");
        curso.setCargaHoraria(8);

        System.out.println(curso);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas Luis de Souza");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos inscritos de Dev " + devLucas.getNome()  + devLucas.getConteudosInscritos());

        System.out.println("--------------------------------");

        devLucas.progredir();
        System.out.println("Contéudos Concluidos de Dev " + devLucas.getNome() + devLucas.getConteudosConcluidos());
        System.out.println("Contéudos inscritos de Dev " + devLucas.getNome()  + devLucas.getConteudosInscritos());

        System.out.println("=---=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        Dev devJoana = new Dev();
        devJoana.setNome("Joana");
        devJoana.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos inscritos de Dev " + devJoana.getNome() + devJoana.getConteudosInscritos());

        System.out.println("--------------------------------");

        devJoana.progredir();
        System.out.println("Contéudos Concluidos de Dev " + devJoana.getNome() + devJoana.getConteudosConcluidos());
        System.out.println("Contéudos inscritos de Dev " + devJoana.getNome() + devJoana.getConteudosInscritos());


    }
}