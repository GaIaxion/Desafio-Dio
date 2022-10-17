import dioDesafio.Curso;
import dioDesafio.Palestra;
import dioDesafio.SeVet;
import dioDesafio.Aluno;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
       // Depois de criar os setter e getters
       // 1. Instanciar os objetos nas classes Curso e palestra (palavra reservada new)
       Curso curso1 = new Curso();
       //2. Atribuir valor através do método set
       // Obs: Aqui você está adicionando dados aos atributos que foram criados anteriormente 
       curso1.setTitulo("Itroducao a Taxidermia e Tecnicas Anatomicas");
       curso1.setDescricao("Introdução a tecnicas basicas de taxidermia, com aula pratica de empalhamento de animais silvestres");
       curso1.setPresencaComputada(30);
       

       //Polimorfismo -- instaciei um curso atraves da classe conteudo , por que conteudo é mãe de curso
       ////Conteudo conteudo = new Curso();
       
       Palestra palestra1 = new Palestra();
       palestra1.setTitulo("Cuidados em Neonatologia Equina");
       palestra1.setDescricao("Aprenda os princiapis cuidados com o potro recem nascido");
       palestra1.setData(LocalDate.now());

       Palestra palestra2 = new Palestra();
       palestra2.setTitulo("Laserterapia em Animais Silvestres");
       palestra2.setDescricao("Aprenda as principais usos e os principios da Laserterapia em Animais Silvestres ");
       palestra2.setData(LocalDate.now());

       Palestra palestra3 = new Palestra();
       palestra3.setTitulo("Atuacao do Medico Veterinario em pandemias");
       palestra3.setDescricao("Aprenda a funcao do medico Veterinario mediante uma pandemia");
       palestra3.setData(LocalDate.now());

       Palestra palestra4 = new Palestra();
       palestra4.setTitulo("Oftalmologia Felina");
       palestra4.setDescricao("Aprenda sobre as principais afeccoes oftalmologicas em gatos");
       palestra4.setData(LocalDate.now());
      
       /*System.out.print(curso1);
       System.out.print(curso2);
       System.out.print(palestra);*/

       SeVet sevet = new SeVet();
       sevet.setNome("sevet Java alunoeloper");
       sevet.setDescricao("Descricao sevet Java alunoeloper");
       sevet.getConteudos().add(curso1);
       sevet.getConteudos().add(palestra1);
       sevet.getConteudos().add(palestra2);
       sevet.getConteudos().add(palestra3);
       sevet.getConteudos().add(palestra4);

       Aluno alunoCamila = new Aluno();
       alunoCamila.setNome("Camila");
       alunoCamila.inscreversevet(sevet);
        System.out.println("Counteúdos Inscritos Camila" + alunoCamila.getConteudosInscritos());
        alunoCamila.progredir();
        alunoCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Camila:" + alunoCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila:" + alunoCamila.getConteudosConcluidos());
        System.out.println("Frequencia:" + alunoCamila.calculaPresencaTotal());
        System.out.println("Situacao:" + alunoCamila.recebeCertificado());

        System.out.println("-------");

       Aluno alunoJoao = new Aluno();
       alunoJoao.setNome("Joao");
       alunoJoao.inscreversevet(sevet);
       System.out.println("Counteudos Inscritos Joao" + alunoJoao.getConteudosInscritos());
       alunoJoao.progredir();
       alunoJoao.progredir();
       alunoJoao.progredir();
       alunoJoao.progredir();
       System.out.println("-");
       System.out.println("Conteudos Inscritos Joao:" + alunoJoao.getConteudosInscritos());
       System.out.println("Conteudos Concluidos Joao:" + alunoJoao.getConteudosConcluidos());
       System.out.println("Frequencia:" + alunoJoao.calculaPresencaTotal());
       System.out.println("Situacao:" + alunoJoao.recebeCertificado());

       



    }
}