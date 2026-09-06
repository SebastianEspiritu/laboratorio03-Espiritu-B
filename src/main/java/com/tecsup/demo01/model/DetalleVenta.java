package com.tecsup.demo01.model;

import jakarta.persistence.*;

@Entity
@Table(name = "detalle_venta")
public class DetalleVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private Long idDetalle;

    private int cantidad;

    @Column(name = "precio_unidad")
    private Double precioUnidad;

    @ManyToOne
    @JoinColumn(name = "id_venta")
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    public DetalleVenta() {}

    public DetalleVenta(Long idDetalle, int cantidad, Double precioUnidad, Venta venta, Producto producto) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
        this.venta = venta;
        this.producto = producto;
    }

    public Long getIdDetalle() { return idDetalle; }
    public void setIdDetalle(Long idDetalle) { this.idDetalle = idDetalle; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public Double getPrecioUnidad() { return precioUnidad; }
    public void setPrecioUnidad(Double precioUnidad) { this.precioUnidad = precioUnidad; }

    public Venta getVenta() { return venta; }
    public void setVenta(Venta venta) { this.venta = venta; }

    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }
}