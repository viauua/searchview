package com.example.login;

public class Usuario {

    String email, id;
        boolean admin;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public Usuario(){

    }

    public Usuario(String email, boolean admin , String id) {
        this.email = email;
        this.admin = admin;
        this.id = id;

    }

}
