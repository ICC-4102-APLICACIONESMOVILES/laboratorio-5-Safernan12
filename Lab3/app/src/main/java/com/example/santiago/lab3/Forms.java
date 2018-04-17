package com.example.santiago.lab3;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity
public class Forms {
    @PrimaryKey(autoGenerate = true)
    private int formId;

    @ColumnInfo(name = "nombre")
    private String nombre;

    @ColumnInfo(name = "fecha")
    private String fecha;

    @ColumnInfo(name = "categoria")
    private String categoria;

    @ColumnInfo(name = "Comentario")
    private String comentario;

    public Forms(){
    }

    public int getFormId(){
        return formId;
    }

    public void setFormId(int new_Id){
        this.formId = new_Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String new_name){
        this.nombre = new_name;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String new_date){
        this.fecha = new_date;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getComentario(){
        return comentario;
    }

    public void setComentario(String new_comentary){
        this.comentario = new_comentary;
    }
}
