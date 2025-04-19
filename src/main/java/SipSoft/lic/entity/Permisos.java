package SipSoft.lic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="permisos")

public class Permisos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPermiso;
    private String nombre;
    private String descripcion;
    
    public Integer getIdPermiso() {
        return idPermiso;
    }
    public void setIdPermiso(Integer idPermiso) {
        this.idPermiso = idPermiso;
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
        return "Permisos [idPermiso=" + idPermiso + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
    }
    
    
    
    



}
