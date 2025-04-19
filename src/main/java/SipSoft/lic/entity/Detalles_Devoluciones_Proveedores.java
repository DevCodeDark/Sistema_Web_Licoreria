package SipSoft.lic.entity;

import java.util.Arrays;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_devolucion_proveedores")
public class Detalles_Devoluciones_Proveedores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetalleDevolucion;
    private Integer cantidad;
    private String motivo;
    @Lob                                             
    @Basic(fetch = FetchType.LAZY)                   
    @Column(name = "imagen", columnDefinition = "LONGBLOB")   
    private byte[] imagen;
    private Integer idDevolucion;
    private Integer idDetalleCompra;
    
    public Integer getIdDetalleDevolucion() {
        return idDetalleDevolucion;
    }
    public void setIdDetalleDevolucion(Integer idDetalleDevolucion) {
        this.idDetalleDevolucion = idDetalleDevolucion;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public byte[] getImagen() {
        return imagen;
    }
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    public Integer getIdDevolucion() {
        return idDevolucion;
    }
    public void setIdDevolucion(Integer idDevolucion) {
        this.idDevolucion = idDevolucion;
    }
    public Integer getIdDetalleCompra() {
        return idDetalleCompra;
    }
    public void setIdDetalleCompra(Integer idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }
    @Override
    public String toString() {
        return "Detalles_Devoluciones_Proveedores [idDetalleDevolucion=" + idDetalleDevolucion + ", cantidad="
                + cantidad + ", motivo=" + motivo + ", imagen=" + Arrays.toString(imagen) + ", idDevolucion="
                + idDevolucion + ", idDetalleCompra=" + idDetalleCompra + "]";
    }
}
