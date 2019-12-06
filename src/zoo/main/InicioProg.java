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
import zoo.zoologicos.Tour;
import zoo.zoologicos.Zoologicos;

/**
 *
 * @author YauYau
 */
public class InicioProg {

    public static ArrayList<Usuarios> usu = new ArrayList<>();
    public static Vector listUsers = new Vector();
    public static ArrayList<Zoologicos> zoos = new ArrayList<>();
    public static Vector listZoos = new Vector();
    public static ArrayList<Tour> tours = new ArrayList<>();
    public static Vector listTour = new Vector();

    public static Login login;
    public static Principal principal;
    public static CadUsuarios cadUs;
    public static TelaAdmSistema telaAS;
    public static TelaAdmZoo telaAZ;

    private static int connectedId = -1;
    private static int typeConnectedUsr = 0;

    public static void main(String[] args) {

        inicializar();
        AdmZoo admZoo = new AdmZoo("ADM", "ZOO", "12312312311", "15253545", "admZ");
        addUser(admZoo);
        AdmSistema admSys = new AdmSistema("ADM", "SISTEMA", "12312312311", "15253545", "admS");
        addUser(admSys);
        Usuarios usr = new Usuarios("USUARIO", "NORMAL", "12312312311", "1234", "usr");
        addUser(usr);
        Zoologicos zoo = new Zoologicos("Borby Zoo", 1, 1, "Eu n sei", "Ananindeua", "PA", 1);
        addZoo(zoo);
        zoo = new Zoologicos("Ronluy Zoo", 1, 1, "Nunca Vi", "Belem", "PA", 1);
        addZoo(zoo);
        zoo = new Zoologicos("Oasko Zoo", 1, 1, "N faço ideia", "Sao Paulo", "SP", 1);
        addZoo(zoo);
        zoo = new Zoologicos("Arag Zoo", 1, 1, "Olha no mapa q tu descobre", "Belo Horizonte", "BH", 1);
        addZoo(zoo);
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

    //Configurações de USUARIO {
    public static void addUser(Usuarios user) {
        usu.add(user);
        listUsers.add(user.getNome() + " " + user.getSobrenome());
    }

    public static int getConnectedUser() {
        return connectedId;
    }

    public static void setConnectedUser(int connectedId) {
        InicioProg.connectedId = connectedId;
    }

    public static int getTypeConnectedUsr() {
        return typeConnectedUsr;
    }

    public static void setTypeConnectedUsr(int typeConnectedUsr) {
        InicioProg.typeConnectedUsr = typeConnectedUsr;
    }

    //Fim das conficurações de USUARIO }
    //Configurações de ZOOS {
    public static void addZoo(Zoologicos zoo) {
        zoos.add(zoo);
        listZoos.add(zoo.getNome());
    }

    //Fim das configurações de ZOOS }

    
    public static void addTour(Tour tour) {
        tours.add(tour);
        listTour.add(tour.getNome());
        System.out.println(tours.size());
    }
}
