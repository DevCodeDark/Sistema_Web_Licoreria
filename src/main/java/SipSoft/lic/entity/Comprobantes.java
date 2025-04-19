package SipSoft.lic.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "comprobante")
public class Comprobantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdComprobante;
    @Column(length = 255)
    private String nombreComprobante;
    @Column(length = 255)
    private String direccionEmpresa;
    private LocalDateTime fechaEmision;
    @Column(length = 255)
    private String numComprobante;
    @Column(columnDefinition = "CHAR(9)", nullable = false)
    private String telefonoEmpresa;
    private Integer idDetalleVenta;
    private Integer idCaja;
    private Integer idTipoComprobante;
    
    public Integer getIdComprobante() {
        return IdComprobante;
    }
    public void setIdComprobante(Integer idComprobante) {
        IdComprobante = idComprobante;
    }
    public String getNombreComprobante() {
        return nombreComprobante;
    }
    public void setNombreComprobante(String nombreComprobante) {
        this.nombreComprobante = nombreComprobante;
    }
    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }
    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }
    public LocalDateTime getFechaEmision() {
        return fechaEmision;
    }
    public void setFechaEmision(LocalDateTime fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    public String getNumComprobante() {
        return numComprobante;
    }
    public void setNumComprobante(String numComprobante) {
        this.numComprobante = numComprobante;
    }
    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }
    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }
    public Integer getIdDetalleVenta() {
        return idDetalleVenta;
    }
    public void setIdDetalleVenta(Integer idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }
    public Integer getIdCaja() {
        return idCaja;
    }
    public void setIdCaja(Integer idCaja) {
        this.idCaja = idCaja;
    }
    public Integer getIdTipoComprobante() {
        return idTipoComprobante;
    }
    public void setIdTipoComprobante(Integer idTipoComprobante) {
        this.idTipoComprobante = idTipoComprobante;
    }
    @Override
    public String toString() {
        return "Comprobantes [IdComprobante=" + IdComprobante + ", nombreComprobante=" + nombreComprobante
                + ", direccionEmpresa=" + direccionEmpresa + ", fechaEmision=" + fechaEmision + ", numComprobante="
                + numComprobante + ", telefonoEmpresa=" + telefonoEmpresa + ", idDetalleVenta=" + idDetalleVenta
                + ", idCaja=" + idCaja + ", idTipoComprobante=" + idTipoComprobante + "]";
    }
}
