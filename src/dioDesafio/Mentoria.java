package dioDesafio;

import java.time.LocalDate;
// Aplicando herança em mentoria

public class Mentoria extends Conteudo {
    //a classe mentoria é filha de Conteudo

    //Local date é uma das classe que conesguimos trabalhar om datas
    LocalDate data;
   //Criando setter e getters

    

    public LocalDate getData() {
        return data;
    }
//Atribuindo mais um valor ao calculaXp
    @Override
    public double calcularXp() {
        // TODO Auto-generated method stub
        return XP_PADRAO + 20d;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
     //Criando toString
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }

 
    
    

}
