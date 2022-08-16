import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de aprendizado de Linguagem Java");
        curso1.setCargaHoraria(8);
       // System.out.println(curso1);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Curso de aprendizado de Linguagem Javascript");
        curso2.setCargaHoraria(4);
        //System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descricao Mentoria do Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria Javascript");
        mentoria2.setDescricao("Descricao Mentoria do Javascript");
        mentoria2.setData(LocalDate.now());

        /*System.out.println(mentoria1);
        System.out.println(mentoria2);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Developer Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos de João"+ devJoao.getConteudosInscritos());

        System.out.println("-");
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos Inscritos de João"+ devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de João"+ devJoao.getConteudosConcluidos());
        System.out.println("XP "+devJoao.calcularXp());

        System.out.println("--------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos de Camila "+ devCamila.getConteudosInscritos());


        System.out.println("=");
        devCamila.progredir();
        devCamila.progredir();

        System.out.println("Conteudos Incritos de Camila "+ devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Camila "+ devCamila.getConteudosConcluidos());
        System.out.println("XP "+devCamila.calcularXp());

    }
}
