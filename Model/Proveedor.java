package com.example.QuizArquiEjercicio1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;


@Entity
@Table(name = "proveedor")
public class Proveedor {

        @Id
        private int idProveedor;

        private String nombre;
        private String telefono;
        private String correo;
        private String direccion;

        @OneToMany(mappedBy = "proveedor")
        private List<Producto> productos;

        public Proveedor() {}

        public Proveedor(int idProveedor, String nombre, String telefono, String correo, String direccion) {
            this.idProveedor = idProveedor;
            this.nombre = nombre;
            this.telefono = telefono;
            this.correo = correo;
            this.direccion = direccion;
        }

        // Getters y setters...

        @Override
        public String toString() {
            return "Proveedor{" +
                    "idProveedor=" + idProveedor +
                    ", nombre='" + nombre + '\'' +
                    ", telefono='" + telefono + '\'' +
                    ", correo='" + correo + '\'' +
                    ", direccion='" + direccion + '\'' +
                    '}';
        }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}

