package dioDesafio;

import java.time.LocalDate;
// Aplicando herança em palestra

public class Palestra extends Conteudo {
    //a classe palestra é filha de Conteudo

    //Local date é uma das classe que conesguimos trabalhar om datas
    LocalDate data;
   //Criando setter e getters

    

    public LocalDate getData() {
        return data;
    }
//Atribuindo mais um valor ao calculaXp
    @Override
    public double calculaPresenca() {
        
        return IN_PRESENCA + 17.5d;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
     //Criando toString
    @Override
    public String toString() {
        return "palestra [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }

 
    
    

}
