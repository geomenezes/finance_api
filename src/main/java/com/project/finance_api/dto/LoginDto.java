package com.project.finance_api.dto;

import lombok.Data;

@Data
public class LoginDto {
    private String email;
    private String senha;

    public LoginDto(String email, String senha){
        this.email=email;
        this.senha=senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
