package com.eryk.myapi.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.util.Objects;

@Entity(name = "Usuarios")
public class Usuario implements Serializable {
    //pega uma sequencia armazenada em rede
    private static final long serialVesionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //Não pode ser vazio



    @NotEmpty(message = "Campo NOME é obrigatório")
    @Length(min = 3, max = 100, message = "O NOME deve ter entre 3 e 100 caracteres")
    private String nome;
    @NotEmpty(message = "Campo LOGIN é obrigatório")
    @Length(min = 3, max = 100, message = "O LOGIN deve ter entre 3 e 100 caracteres")
    private String login;
    @NotEmpty(message = "Campo SENHA é obrigatório")
    @Length(min = 3, max = 100, message = "A SENHA deve ter entre 3 e 100 caracteres")
    private String senha;

    public Usuario() {
    }

    public Usuario(Integer id, String nome, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.login = login;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
