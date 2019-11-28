/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.usuarios;

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
    private static int connectedId = -1;
    
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
        listUsers.add(user.getNome() + " " + user.getSobrenome());
    }
    
    public static void rmUser(Usuarios user){
        usu.remove(usu);
        listUsers.remove(user.getNome() + " " + user.getSobrenome());
    }
    
    public static String getUserNome(int num){
        return usu.get(num).getNome();
    }
    
    public static String getUserSobrenome(int num){
        return usu.get(num).getSobrenome();
    }
    
    public static String getUserSenha(int num){
        return usu.get(num).getSenha();
    }
    
    public static String getUserEmail(int num){
        return usu.get(num).getEmail();
    }
    
    public static String getUserCpf(int num){
        return usu.get(num).getCpf();
    }
    
    public static int getUserId(int num){
        return usu.get(num).getId();
    }
    
    public static int getUserLength(){
        return usu.size();
    }

    public static int getConnectedUser(){
        return connectedId;
    }
    
    public static void setConnectedUser(int connectedId){
        InicioProg.connectedId = connectedId;
    }
}
