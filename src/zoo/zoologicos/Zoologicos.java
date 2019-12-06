/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.zoologicos;

import java.util.ArrayList;
import zoo.main.InicioProg;
/**
 *
 * @author Pc27sala06
 */
public class Zoologicos {

    private String Nome;
    private String ID;
    private int Abre;
    private int Fecha;
    private String Endereco;
    private String Cidade;
    private String UF;
    private boolean[] Status = new boolean[7];
    private float Valor_entrada;
    private int Qtd_tour;

    ArrayList<Animais> listaAnimais = new ArrayList();
    
    
    public String getNome(){
        return Nome;
    }
    
    public String getID() {
        return ID;
    }

    public int getAbre() {
        return Abre;
    }

    public int getFecha() {
        return Fecha;
    }

    public String getEndereco() {
        return Endereco;
    }

    public String getCidade() {
        return Cidade;
    }

    public String getUF() {
        return UF;
    }

    public float getValor_entrada() {
        return Valor_entrada;
    }
    
    public boolean[] getStatus(){
        return Status;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setAbre(int Abre) {
        this.Abre = Abre;
    }

    public void setFecha(int Fecha) {
        this.Fecha = Fecha;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public void setStatus(boolean[] Status) {
        this.Status = Status;
    }

    public void setValor_entrada(float Valor_entrada) {
        this.Valor_entrada = Valor_entrada;
    }

    public int getQtd_tour() {
        return Qtd_tour;
    }

    public void setQtd_tour(int Qtd_tour) {
        this.Qtd_tour = Qtd_tour;
    }
}
