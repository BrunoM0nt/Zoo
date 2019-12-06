/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.Adm;

import zoo.main.InicioProg;
import zoo.usuarios.Usuarios;

public class AdmSistema extends Usuarios {

    private int CodAdmSys;
    
    public AdmSistema() {
        id = InicioProg.usu.size();
        tipoUsr = 2;
    }

    public AdmSistema(String nome, String sobrenome, String cpf, String senha, String email) {
        super(nome, sobrenome, cpf, senha, email);
        id = InicioProg.usu.size();
        tipoUsr = 2;
    }

    public int getCodAdmSys() {
        return CodAdmSys;
    }

    public void setCodAdmSys(int CodAdmSys) {
        this.CodAdmSys = CodAdmSys;
    }
    
    
}
