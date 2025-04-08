package com.example.QuizArquiEjercicio1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "cliente")
public class Cliente {

        @Id
        private int idCliente;
        private String nombre;
        private String cedula;
        private String telefono;
        private String correo;

        public Cliente() {}

        public Cliente(int idCliente, String nombre, String cedula, String telefono, String correo) {
            this.idCliente = idCliente;
            this.nombre = nombre;
            this.cedula = cedula;
            this.telefono = telefono;
            this.correo = correo;
        }


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
        public String toString() {
            return "Cliente{" +
                    "idCliente=" + idCliente +
                    ", nombre='" + nombre + '\'' +
                    ", cedula='" + cedula + '\'' +
                    ", telefono='" + telefono + '\'' +
                    ", correo='" + correo + '\'' +
                    '}';
        }


    }

