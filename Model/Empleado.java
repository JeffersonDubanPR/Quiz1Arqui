package com.example.QuizArquiEjercicio1.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

        @Id
        private int idEmpleado;
        private String nombre;
        private String cargo;
        private String telefono;

        public Empleado() {}

        public Empleado(int idEmpleado, String nombre, String cargo, String telefono) {
            this.idEmpleado = idEmpleado;
            this.nombre = nombre;
            this.cargo = cargo;
            this.telefono = telefono;
        }

        @Override
        public String toString() {
            return "Empleado{" +
                    "idEmpleado=" + idEmpleado +
                    ", nombre='" + nombre + '\'' +
                    ", cargo='" + cargo + '\'' +
                    ", telefono='" + telefono + '\'' +
                    '}';
        }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
