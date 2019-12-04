/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.zoologicos;

/**
 *
 * @author Pc27sala06
 */
public class Animais {

    private String Nome;
    private String Especie;
    private String quantidade;
    private int Id_Zoo;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public String getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public int getId_Zoo() {
        return Id_Zoo;
    }

    public void setId_Zoo(int Id_Zoo) {
        this.Id_Zoo = Id_Zoo;
    }
}
