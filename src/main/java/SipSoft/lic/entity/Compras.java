package SipSoft.lic.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "compras")
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCompra;
    private LocalDateTime fechaCompra;
    private Integer estado = 1;
    private String guiaRemision;
    @Column(length = 255)
    private String numCorrelativo;
    private Integer idProveedor;
    private Integer idTipoCompra;
    private Integer idEmpresa;
    private Integer idTipoPago;
    
    public Integer getIdCompra() {
        return idCompra;
    }
    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }
    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(LocalDateTime fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public Integer getEstado() {
        return estado;
    }
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    public String getGuiaRemision() {
        return guiaRemision;
    }
    public void setGuiaRemision(String guiaRemision) {
        this.guiaRemision = guiaRemision;
    }
    public String getNumCorrelativo() {
        return numCorrelativo;
    }
    public void setNumCorrelativo(String numCorrelativo) {
        this.numCorrelativo = numCorrelativo;
    }
    public Integer getIdProveedor() {
        return idProveedor;
    }
    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }
    public Integer getIdTipoCompra() {
        return idTipoCompra;
    }
    public void setIdTipoCompra(Integer idTipoCompra) {
        this.idTipoCompra = idTipoCompra;
    }
    public Integer getIdEmpresa() {
        return idEmpresa;
    }
    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public Integer getIdTipoPago() {
        return idTipoPago;
    }
    public void setIdTipoPago(Integer idTipoPago) {
        this.idTipoPago = idTipoPago;
    }
    @Override
    public String toString() {
        return "Compra [idCompra=" + idCompra + ", fechaCompra=" + fechaCompra + ", estado=" + estado
                + ", guiaRemision=" + guiaRemision + ", numCorrelativo=" + numCorrelativo + ", idProveedor="
                + idProveedor + ", idTipoCompra=" + idTipoCompra + ", idEmpresa=" + idEmpresa + ", idTipoPago="
                + idTipoPago + "]";
    }
}
