/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.usuarios;
/**
 *
 * @author Pc27sala06
 */
public class AdmZoo extends Usuarios{
    private int TOKEN;
    private Zoologicos IDZoo = new Zoologicos();
    
    public int getTOKEN() {
        return TOKEN;
    }

    public void setTOKEN(int TOKEN) {
        this.TOKEN = TOKEN;
    }
    
}
