import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Paulo: " + devPaulo.getConteudosInscritos());
        devPaulo.progredir();
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("Conteúdos inscritos Paulo: " + devPaulo.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Paulo: " + devPaulo.getConteudosConcluidos());
        System.out.println("XP : " + devPaulo.calcularTotalXp());

        Dev devTeste = new Dev();
        devTeste.setNome("Dev Teste");
        devTeste.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos DevTeste: " + devTeste.getConteudosInscritos());
        devTeste.progredir();
        devTeste.progredir();
        devTeste.progredir();
        System.out.println("Conteudos inscritos DevTeste: " + devTeste.getConteudosInscritos());
        System.out.println("Conteudos concluidos DevTeste: " + devTeste.getConteudosConcluidos());
        System.out.println("XP : " + devTeste.calcularTotalXp());




    }
}
