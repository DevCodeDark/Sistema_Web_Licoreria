package SipSoft.lic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="rol_permisos")

public class Rol_Permisos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer IdRolPermiso;	
    private Integer idPermiso;
    private Integer idRol;
    private Integer idModulo;
    public Integer getIdRolPermiso() {
        return IdRolPermiso;
    }
    public void setIdRolPermiso(Integer idRolPermiso) {
        IdRolPermiso = idRolPermiso;
    }
    public Integer getIdPermiso() {
        return idPermiso;
    }
    public void setIdPermiso(Integer idPermiso) {
        this.idPermiso = idPermiso;
    }
    public Integer getIdRol() {
        return idRol;
    }
    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }
    public Integer getIdModulo() {
        return idModulo;
    }
    public void setIdModulo(Integer idModulo) {
        this.idModulo = idModulo;
    }
    @Override
    public String toString() {
        return "Rol_Permisos [IdRolPermiso=" + IdRolPermiso + ", idPermiso=" + idPermiso + ", idRol=" + idRol
                + ", idModulo=" + idModulo + "]";
    }

    
    
}
