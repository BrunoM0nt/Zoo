package zoo.usuarios;

import zoo.main.InicioProg;

public class Usuarios {

    protected int id;
    protected String nome;
    protected String sobrenome;
    protected String cpf;
    protected String senha;
    protected String email;
    protected int tipoUsr;

    public Usuarios(){
        id = InicioProg.nUsr;
        nome = "";
        sobrenome = "";
        cpf = "";
        senha = "";
        email = "";
        tipoUsr = 0;
    }

    public Usuarios(String nome, String sobrenome, String cpf, String senha, String email) {
        id = InicioProg.nUsr;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.senha = senha;
        this.email = email;
        this.tipoUsr = 0;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public int getTipoUsr(){
        return tipoUsr;
    }
}
