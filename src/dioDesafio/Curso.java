package dioDesafio;

public class Curso extends Conteudo {
    //criando atrbutos tipo nome;

   
    private int PresencaComputada;
    // uma boa pratica é criar modoficadores de acesso que são palavras reservadas em java 
    // que diz que se atributo é private, protected ou public. O melhor é colocar private.
    // Para trabalhar com modificadores tem que criar getters e setters
    // Tem atalho pra isso, no VScode tem que ter a extessão Pack for Java + tutorial(https://www.youtube.com/watch?v=sSijBcBGKME)
    
    @Override
    public double calculaPresenca() {
        //Regra de negócio
       
        return IN_PRESENCA + PresencaComputada;
    }
   
    public int getPresencaComputada() {
        return PresencaComputada;
    }
    public void setPresencaComputada(int PresencaComputada) {
        this.PresencaComputada = PresencaComputada;
    }
   //Com o mesmo atalho do video vc consegue criar um to String.
   // para imprimir e ver se está tudo certo
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", PresencaComputada=" + PresencaComputada + "]";
    }


}
