package SipSoft.lic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="sucursales")

public class Sucursales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idSucursal;
    private String nombre;
    private Integer idUbicacion;
    private Integer idEmpresa;
    public Integer getIdSucursal() {
        return idSucursal;
    }
    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getIdUbicacion() {
        return idUbicacion;
    }
    public void setIdUbicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }
    public Integer getIdEmpresa() {
        return idEmpresa;
    }
    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    @Override
    public String toString() {
        return "Sucursales [idSucursal=" + idSucursal + ", nombre=" + nombre + ", idUbicacion=" + idUbicacion
                + ", idEmpresa=" + idEmpresa + "]";
    }

    
    

}
