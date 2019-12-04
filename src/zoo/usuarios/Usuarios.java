package zoo.usuarios;

public class Usuarios {

    private int id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String senha;
    private String email;
    private String ConfirmaSenha;
    private int TOKEN = 0;

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

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getTOKEN() {
        return TOKEN;
    }

    public void setTOKEN(int TOKEN) {
        this.TOKEN = TOKEN;
    }
    
}
