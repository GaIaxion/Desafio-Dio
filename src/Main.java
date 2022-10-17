import dioDesafio.Curso;
import dioDesafio.Mentoria;
import dioDesafio.Bootcamp;
import dioDesafio.Dev;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
       // Depois de criar os setter e getters
       // 1. Instanciar os objetos nas classes Curso e Mentoria (palavra reservada new)
       Curso curso1 = new Curso();
       //2. Atribuir valor através do método set
       // Obs: Aqui você está adicionando dados aos atributos que foram criados anteriormente 
       curso1.setTitulo("curso Java");
       curso1.setDescricao("Descricao curso Java");
       curso1.setCargaoraria(8);
       
       // Criando outro curso
       Curso curso2 = new Curso();
       curso2.setTitulo("curso Js");
       curso2.setDescricao("Descricao curso Js");
       curso2.setCargaoraria(4);

       //Polimorfismo -- instaciei um curso atraves da classe conteudo , por que conteudo é mãe de curso
       ////Conteudo conteudo = new Curso();
       
       Mentoria mentoria = new Mentoria();
       mentoria.setTitulo("mentoria de Java");
       mentoria.setDescricao("Descricaoo mentoria java");
       mentoria.setData(LocalDate.now());
      
       /*System.out.print(curso1);
       System.out.print(curso2);
       System.out.print(mentoria);*/

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp Java Developer");
       bootcamp.setDescricao("Descricao Bootcamp Java Developer");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria);

       Dev devCamila = new Dev();
       devCamila.setNome("Camila");
       devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Counteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

       Dev devJoao = new Dev();
       devJoao.setNome("Joao");
       devJoao.inscreverBootcamp(bootcamp);
       System.out.println("Counteudos Inscritos Joao" + devJoao.getConteudosInscritos());
       devJoao.progredir();
       devJoao.progredir();
       devJoao.progredir();
       System.out.println("-");
       System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudosInscritos());
       System.out.println("Conteudos Concluidos Joao:" + devJoao.getConteudosConcluidos());
       System.out.println("XP:" + devJoao.calcularTotalXp());


    }
}