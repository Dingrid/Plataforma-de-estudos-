import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //cria um curso de java
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        //cria um curso de s
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        //cria mentoria de java
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        //adiciona os cursos e mentoria criados acima num bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //cria um aluno
        Dev devIngrid = new Dev();
        devIngrid.setNome("Ingrid");

        //inscreve o aluno no bootcamp
        devIngrid.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ingrid:" + devIngrid.getConteudosInscritos());

        //faz os cursos
        devIngrid.progredir();
        devIngrid.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ingrid:" + devIngrid.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ingrid:" + devIngrid.getConteudosConcluidos());
        System.out.println("XP:" + devIngrid.calcularTotalXp());

        System.out.println("-------");

        //cria um aluno
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");

        //inscreve no bootcamp
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());

        //conclui o bootcamp
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos()); //como joao conclui o bootcamp ele nao esta inscrito em nenhum conteudo
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos()); //os conteudos do bootcamp aparecem aqui (curso java, js e mentoria java)
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
}
