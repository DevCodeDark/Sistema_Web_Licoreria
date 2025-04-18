package SipSoft.lic.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cajas")
public class Cajas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCaja;
    @Column(precision = 6, scale = 2, nullable = false)
    private BigDecimal montoInicial;
    private LocalDateTime fechaApertura;
    private LocalDateTime fechaCierre;
    @Column(precision = 6, scale = 2, nullable = false)
    private BigDecimal montoTotal;
    @Column(length = 20)
    private String numCaja;
    private Integer estado = 1;
    private Integer idUsuario;
    
    public Integer getIdCaja() {
        return idCaja;
    }
    public void setIdCaja(Integer idCaja) {
        this.idCaja = idCaja;
    }
    public BigDecimal getMontoInicial() {
        return montoInicial;
    }
    public void setMontoInicial(BigDecimal montoInicial) {
        this.montoInicial = montoInicial;
    }
    public LocalDateTime getFechaApertura() {
        return fechaApertura;
    }
    public void setFechaApertura(LocalDateTime fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    public LocalDateTime getFechaCierre() {
        return fechaCierre;
    }
    public void setFechaCierre(LocalDateTime fechaCierre) {
        this.fechaCierre = fechaCierre;
    }
    public BigDecimal getMontoTotal() {
        return montoTotal;
    }
    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }
    public String getNumCaja() {
        return numCaja;
    }
    public void setNumCaja(String numCaja) {
        this.numCaja = numCaja;
    }
    public Integer getEstado() {
        return estado;
    }
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    public Integer getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    @Override
    public String toString() {
        return "Caja [idCaja=" + idCaja + ", montoInicial=" + montoInicial + ", fechaApertura=" + fechaApertura
                + ", fechaCierre=" + fechaCierre + ", montoTotal=" + montoTotal + ", numCaja=" + numCaja + ", estado="
                + estado + ", idUsuario=" + idUsuario + "]";
    }
}
