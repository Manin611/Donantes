package com.Cesde.donantes.Modelo;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="donaciones")
public class MDonacion {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_donacion", nullable = false)
    Integer idDonacion;

    @Column(name="id_donante", nullable = false)
    Integer idDonante;

    @Column(name="id_solicitud", nullable = false)
    Integer idSolicitud;

    @Column(name="fecha_donacion", nullable = false)
    LocalDate fechaDonacion;

    @Column(name="cantidad_ml", nullable = false)
    Integer cantidadMl;

    @Column(length = 20, nullable = false)
    String estado;

    // Relaciones

    // Constructores
    public MDonacion(Integer idDonacion, Integer idDonante, Integer idSolicitud,
                     LocalDate fechaDonacion, Integer cantidadMl, String estado) {
        this.idDonacion = idDonacion;
        this.idDonante = idDonante;
        this.idSolicitud = idSolicitud;
        this.fechaDonacion = fechaDonacion;
        this.cantidadMl = cantidadMl;
        this.estado = estado;
    }
    public MDonacion() {
    }

    // Encapsulamiento
    public Integer getIdDonacion() {
        return idDonacion;
    }
    public void setIdDonacion(Integer idDonacion) {
        this.idDonacion = idDonacion;
    }

    public Integer getIdDonante() {
        return idDonante;
    }
    public void setIdDonante(Integer idDonante) {
        this.idDonante = idDonante;
    }

    public Integer getIdSolicitud() {
        return idSolicitud;
    }
    public void setIdSolicitud(Integer idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public LocalDate getFechaDonacion() {
        return fechaDonacion;
    }
    public void setFechaDonacion(LocalDate fechaDonacion) {
        this.fechaDonacion = fechaDonacion;
    }

    public Integer getCantidadMl() {
        return cantidadMl;
    }
    public void setCantidadMl(Integer cantidadMl) {
        this.cantidadMl = cantidadMl;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
