package com.example.QuizArquiEjercicio1.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "detalle_venta")
public class DetalleVenta {

        @Id
        private int idDetalle;

        @ManyToOne
        @JoinColumn(name = "id_venta")
        private Venta venta;

        @ManyToOne
        @JoinColumn(name = "id_producto")
        private Producto producto;

        private int cantidad;
        private double precioUnitario;

        public DetalleVenta() {}

        public DetalleVenta(int idDetalle, Venta venta, Producto producto, int cantidad, double precioUnitario) {
            this.idDetalle = idDetalle;
            this.venta = venta;
            this.producto = producto;
            this.cantidad = cantidad;
            this.precioUnitario = precioUnitario;
        }

        @Override
        public String toString() {
            return "DetalleVenta{" +
                    "idDetalle=" + idDetalle +
                    ", producto=" + producto.getNombre() +
                    ", cantidad=" + cantidad +
                    ", precioUnitario=" + precioUnitario +
                    '}';
        }


    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
