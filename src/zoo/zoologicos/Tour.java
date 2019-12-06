/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.zoologicos;

import java.util.Date;

/**
 *
 * @author Dinopc
 */
public class Tour {

    private String Nome;
    private String Descricao;
    private float Preco;
    private String Hora;
    private String data;
    private int Nparticipantes;
    private int id_tour_zoo;

    public int getNparticipantes() {
        return Nparticipantes;
    }

    public void setNparticipantes(int Nparticipantes) {
        this.Nparticipantes = Nparticipantes;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float Preco) {
        this.Preco = Preco;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public int getId_tour_zoo() {
        return id_tour_zoo;
    }

    public void setId_tour_zoo(int id_tour_zoo) {
        this.id_tour_zoo = id_tour_zoo;
    }
}
