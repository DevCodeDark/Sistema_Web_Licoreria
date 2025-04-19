package SipSoft.lic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="ubicaciones")

public class Ubicaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idUbicacion;
    private String descripcion;
    public Integer getIdUbicacion() {
        return idUbicacion;
    }
    public void setIdUbicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public String toString() {
        return "Ubicaciones [idUbicacion=" + idUbicacion + ", descripcion=" + descripcion + "]";
    }

}
