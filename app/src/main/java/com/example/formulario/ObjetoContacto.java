package com.example.formulario;

public class ObjetoContacto {

    String name;
    String email;
    String telefono;
    String direccion;
    String date;

    public ObjetoContacto(String name, String email, String telefono, String direccion, String date) {
        this.name = name;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
