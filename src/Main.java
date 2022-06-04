import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição Curso Javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("==================================================================================================================");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Camila " + devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Inscritos de Camila " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Camila " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("==================================================================================================================");

        Dev devRobson = new Dev();
        devRobson.setNome("Robson");
        devRobson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Robson" + devRobson.getConteudosInscritos());

        devRobson.progredir();
        devRobson.progredir();
        devRobson.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Inscritos de Robson" + devRobson.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Robson" + devRobson.getConteudosConcluidos());
        System.out.println("XP: " + devRobson.calcularTotalXp());

        System.out.println("==================================================================================================================");

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

    }

}
