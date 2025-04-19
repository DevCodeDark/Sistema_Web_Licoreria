package SipSoft.lic.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
@SQLDelete(sql = "UPDATE productos SET estado=0 WHERE idProducto = ?")
@Where(clause="estado = 1")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idProducto;
    private String descripcion;
    private Integer ganaciaPorcentaje;
    private Double precioUnitario;
    private String imagenURL;
    private Integer estado;
    private Integer idEmpresa;    
    private Integer idCategoria;
    private Integer idUnidadMedida;
    private Integer CodBarras;
    public Integer getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Integer getGanaciaPorcentaje() {
        return ganaciaPorcentaje;
    }
    public void setGanaciaPorcentaje(Integer ganaciaPorcentaje) {
        this.ganaciaPorcentaje = ganaciaPorcentaje;
    }
    public Double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public String getImagenURL() {
        return imagenURL;
    }
    public void setImagenURL(String imagenURL) {
        this.imagenURL = imagenURL;
    }
    public Integer getEstado() {
        return estado;
    }
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    public Integer getIdEmpresa() {
        return idEmpresa;
    }
    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public Integer getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
    public Integer getIdUnidadMedida() {
        return idUnidadMedida;
    }
    public void setIdUnidadMedida(Integer idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }
    public Integer getCodBarras() {
        return CodBarras;
    }
    public void setCodBarras(Integer codBarras) {
        CodBarras = codBarras;
    }
    @Override
    public String toString() {
        return "Productos [idProducto=" + idProducto + ", descripcion=" + descripcion + ", ganaciaPorcentaje="
                + ganaciaPorcentaje + ", precioUnitario=" + precioUnitario + ", imagenURL=" + imagenURL + ", estado="
                + estado + ", idEmpresa=" + idEmpresa + ", idCategoria=" + idCategoria + ", idUnidadMedida="
                + idUnidadMedida + ", CodBarras=" + CodBarras + "]";
    }

    

}
