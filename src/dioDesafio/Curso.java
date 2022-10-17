package dioDesafio;

public class Curso extends Conteudo {
    //criando atrbutos tipo nome;

   
    private int cargaHoraria;
    // uma boa pratica é criar modoficadores de acesso que são palavras reservadas em java 
    // que diz que se atributo é private, protected ou public. O melhor é colocar private.
    // Para trabalhar com modificadores tem que criar getters e setters
    // Tem atalho pra isso, no VScode tem que ter a extessão Pack for Java + tutorial(https://www.youtube.com/watch?v=sSijBcBGKME)
    
    @Override
    public double calcularXp() {
        //Regra de negócio
        // TODO Auto-generated method stub
        return XP_PADRAO * cargaHoraria;
    }
   
    public int getCargaoraria() {
        return cargaHoraria;
    }
    public void setCargaoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
   //Com o mesmo atalho do video vc consegue criar um to String.
   // para imprimir e ver se está tudo certo
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaoraria=" + cargaHoraria + "]";
    }


}
