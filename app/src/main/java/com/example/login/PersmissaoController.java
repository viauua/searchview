package com.example.login;

import com.google.firebase.auth.FirebaseAuth;

public    class PersmissaoController {

    FirebaseAuth mAuth;

    public  FirebaseAuth getmAuth() {
        return mAuth;
    }

    public void setmAuth(FirebaseAuth mAuth) {
        this.mAuth = mAuth;
    }

    public  boolean usuarioTemPermissao(String s){
        //consulta no firebase
        return  true;
    }

}
