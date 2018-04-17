package com.example.santiago.lab3;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity
public class Users {
    @PrimaryKey(autoGenerate = true)
    private int userId;

    @ColumnInfo(name = "Usuario")
    private String name;

    @ColumnInfo(name = "Clave")
    private String password;

    @ColumnInfo(name = "Email")
    private String email;


    public Users(){
    }

    public int getUserId(){
        return userId;
    }

    public void setUserId(int new_Id){
        this.userId = new_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String new_name){
        this.name = new_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String new_password){
        this.password = new_password;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String new_email) {
        this.email = new_email;
    }
}
