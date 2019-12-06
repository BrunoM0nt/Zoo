/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.Adm;

import zoo.main.InicioProg;
import zoo.usuarios.Usuarios;

/**
 *
 * @author Pc27sala06
 */
public class AdmZoo extends Usuarios {
    
    private int CodAdmZoo;
    
    public AdmZoo(){
        id = InicioProg.usu.size();
        tipoUsr = 1;
    }

    public AdmZoo(String nome, String sobrenome, String cpf, String senha, String email) {
        super(nome, sobrenome, cpf, senha, email);
        id = InicioProg.usu.size();
        tipoUsr = 1;
    }
    
    public int getCodUsuZoo() {
        return CodAdmZoo;
    }

    public void setCodUsuZoo(int CodUsuZoo) {
        this.CodAdmZoo = CodUsuZoo;
    }
}
