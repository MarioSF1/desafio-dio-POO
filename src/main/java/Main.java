import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java 21");
        curso1.setDescricao("Aprenda tudo sobre o Java 21 e suas vantagens");
        curso1.setCargaHoraria(72);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso React + Typescript");
        curso2.setDescricao("Curso avançado de frontend com a tipagem do Typescript");
        curso2.setCargaHoraria(58);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Caso possua dúvidas, entre em contato com o mentor");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp completo para se tornar um desenvolvedor Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMario = new Dev();
        devMario.setNome("Mário");
        devMario.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mário:" + devMario.getConteudosInscritos());
        devMario.progredir();
        devMario.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Mário:" + devMario.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Mário:" + devMario.getConteudosConcluidos());
        System.out.println("XP:" + devMario.calcularTotalXp());

        System.out.println("-------");

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gabriel:" + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Gabriel:" + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Gabriel:" + devGabriel.getConteudosConcluidos());
        System.out.println("XP:" + devGabriel.calcularTotalXp());

    }

}