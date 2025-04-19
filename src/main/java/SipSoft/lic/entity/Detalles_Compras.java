package SipSoft.lic.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_compras")
public class Detalles_Compras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetalleCompra;
    private Integer cantidad;
    @Column(precision = 2, scale = 2, nullable = false)
    private BigDecimal igv;
    @Column(precision = 6, scale = 2, nullable = false)
    private BigDecimal montoTotal;
    private Integer idCompra;
    private Integer idProducto;

    public Integer getIdDetalleCompra() {
        return idDetalleCompra;
    }
    public void setIdDetalleCompra(Integer idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public BigDecimal getIgv() {
        return igv;
    }
    public void setIgv(BigDecimal igv) {
        this.igv = igv;
    }
    public BigDecimal getMontoTotal() {
        return montoTotal;
    }
    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }
    public Integer getIdCompra() {
        return idCompra;
    }
    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }
    public Integer getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
    @Override
    public String toString() {
        return "Detalles_Compras [idDetalleCompra=" + idDetalleCompra + ", cantidad=" + cantidad + ", igv=" + igv
                + ", montoTotal=" + montoTotal + ", idCompra=" + idCompra + ", idProducto=" + idProducto + "]";
    }
}
