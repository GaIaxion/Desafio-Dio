package dioDesafio;

  //Uma classe abstratic indica que eu não consigo instanciar (criar) o conteúdo
// Para fazer uma classe abstrata a classe mãe tem que ser abstrata
public abstract class Conteudo {
  //Criando uma constante para isso uso um final como tipo.
  //Static é um modificador de acesso  
  protected static final double XP_PADRAO = 10d;
  //Vamos criar os atributos título e descrição e o método calculadora

  private String titulo;
  private String descricao;
 // minhas classes filhas serão obrigadas a  implementar uma lógica nesse método XP
  //Uma classe abstratic indica que eu não consigo instanciar (criar) o conteúdo
 
    public abstract double calcularXp();
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
