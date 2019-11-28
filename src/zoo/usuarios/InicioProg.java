/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.usuarios;

import java.awt.List;
import java.util.ArrayList;
import java.util.Vector;
import zoo.telas.*;
    
/**
 *
 * @author YauYau
 */
public class InicioProg {
    public static ArrayList<Usuarios> usu = new ArrayList<>();
    public static Vector listUsers = new Vector();
    public static Login login;
    public static Principal principal;
    public static CadUsuarios cadUs;
    
    public static void main(String[] args){
        inicializar();
    }
    
    private static void inicializar(){
        login = new Login();
        login.setVisible(true);
        principal = new Principal();
        cadUs = new CadUsuarios();  
        
    }
    
    public static void addUser(Usuarios user){
        usu.add(user);
        listUsers.add(user.getNome());
    }
    
    public static void rmUser(Usuarios user){
        usu.remove(usu);
        listUsers.remove(user.getNome());
    }
    
    public static String getUser(int num){
        return usu.get(num).getNome();
    }
    
    public static int getUserLength(){
        return usu.size();
    }

}
