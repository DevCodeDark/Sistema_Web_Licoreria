package SipSoft.lic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="tipo_notificaciones")

public class Tipo_Notificaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idTipoNotificacion;
    private String nombre;
    private String descripcion;
    
    public Integer getIdTipoNotificacion() {
        return idTipoNotificacion;
    }
    public void setIdTipoNotificacion(Integer idTipoNotificacion) {
        this.idTipoNotificacion = idTipoNotificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString() {
        return "Tipo_Notificaciones [idTipoNotificacion=" + idTipoNotificacion + ", nombre=" + nombre + ", descripcion="
                + descripcion + "]";
    }
    
}
