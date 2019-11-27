package zoo.usuarios;

import java.util.ArrayList;

public class Usuarios {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String senha;
    private String email;
    private String ConfirmaSenha;
    
   

    public String getConfirmaSenha() {
        return ConfirmaSenha;
    }

    public void setConfirmaSenha(String ConfirmaSenha) {
        this.ConfirmaSenha = ConfirmaSenha;
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

}
