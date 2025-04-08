package com.example.QuizArquiEjercicio1.Model;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "venta")
public class Venta {

        @Id
        private int idVenta;

        private Date fecha;

        @ManyToOne
        @JoinColumn(name = "id_cliente")
        private Cliente cliente;

        @ManyToOne
        @JoinColumn(name = "id_empleado")
        private Empleado empleado;

        @OneToMany(mappedBy = "venta")
        private List<DetalleVenta> detalles;

        public Venta() {}

        public Venta(int idVenta, Date fecha, Cliente cliente, Empleado empleado) {
            this.idVenta = idVenta;
            this.fecha = fecha;
            this.cliente = cliente;
            this.empleado = empleado;
        }

        @Override
        public String toString() {
            return "Venta{" +
                    "idVenta=" + idVenta +
                    ", fecha=" + fecha +
                    ", cliente=" + cliente.getNombre() +
                    ", empleado=" + empleado.getNombre() +
                    '}';
        }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleVenta> detalles) {
        this.detalles = detalles;
    }
}
