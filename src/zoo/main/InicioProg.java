/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.main;

import zoo.Adm.AdmZoo;
import java.util.ArrayList;
import java.util.Vector;
import zoo.Adm.AdmSistema;
import zoo.telas.*;
import zoo.usuarios.Usuarios;
import zoo.zoologicos.Zoologicos;

/**
 *
 * @author YauYau
 */
public class InicioProg {

    public static ArrayList<Usuarios> usu = new ArrayList<>();
    public static ArrayList<AdmZoo> usuzoo = new ArrayList<>();

    public static Vector listUsers = new Vector();
    public static Login login;
    public static Principal principal;
    public static CadUsuarios cadUs;
    public static TelaAdmSistema telaAS;
    public static TelaAdmZoo telaAZ;

    private static int connectedId = -1;
    private static int typeConnectedUsr = 0;
    public static int nUsr = 0;

    public static void main(String[] args) {

        inicializar();
        AdmZoo admZoo = new AdmZoo("ADM", "ZOO", "12312312311", "15253545", "admZ");
        addUser(admZoo);
        AdmSistema admSys = new AdmSistema("ADM", "SISTEMA", "12312312311", "15253545", "admS");
        addUser(admSys);
        Usuarios usr = new Usuarios("USUARIO", "NORMAL", "12312312311", "1234", "usr");
        addUser(usr);

    }

    private static void inicializar() {

        //Configuraçao de Tela -- Interface
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //Padrao de iniciaçao
        login = new Login();
        login.setVisible(true);
        principal = new Principal();
        cadUs = new CadUsuarios();
        telaAS = new TelaAdmSistema();
        telaAZ = new TelaAdmZoo();

    }

    public static void addUser(Usuarios user) {
        usu.add(user);
        nUsr++;
        listUsers.add(user.getNome() + " " + user.getSobrenome());
    }

    public static void addUserZoo(AdmZoo CodAdmZoo) {
        usuzoo.add(CodAdmZoo);

    }

    /*public static void rmUser(Usuarios user) {
        usu.remove(usu);
        listUsers.remove(user.getNome() + " " + user.getSobrenome());
    }*/

    public static String getUserNome(int num) {
        return usu.get(num).getNome();
    }

    public static String getUserSobrenome(int num) {
        return usu.get(num).getSobrenome();
    }

    public static String getUserSenha(int num) {
        return usu.get(num).getSenha();
    }

    public static String getUserEmail(int num) {
        return usu.get(num).getEmail();
    }

    public static String getUserCpf(int num) {
        return usu.get(num).getCpf();
    }

    public static int getUserId(int num) {
        return usu.get(num).getId();
    }

    public static int getUserLength() {
        return usu.size();
    }

    public static int getUsuzooLength() {
        return usuzoo.size();
    }

    public static int getConnectedUser() {
        return connectedId;
    }

    public static void setConnectedUser(int connectedId) {
        InicioProg.connectedId = connectedId;
    }

    public static int getUsuZooCod(int num) {
        return usuzoo.get(num).getCodUsuZoo();
    }

    public static int getTypeConnectedUsr() {
        return typeConnectedUsr;
    }

    public static void setTypeConnectedUsr(int typeConnectedUsr) {
        InicioProg.typeConnectedUsr = typeConnectedUsr;
    }

}
