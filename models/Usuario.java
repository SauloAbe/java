package br.com.criandoapi.projeto.models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer Id;

    @Column(name = "nome_completo", length = 200, nullable = true)
    private String nome;

    @Column(name="username", length = 50, nullable = true)
    private String username;

    @Column(name="email", length = 50, nullable = true)
    private String email;

    @Column(name="senha", columnDefinition = "TEXT", nullable = true)
    private String senha;

    @Column(name="telefone", length = 15, nullable = true)
    private String telefone;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
