package SipSoft.lic.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="proveedores")
@SQLDelete(sql = "UPDATE proveedores SET estado=0 WHERE idProveedor = ?")
@Where(clause="estado = 1")

public class Proveedores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idProveedor;
    private String nombreProveedor;
    private String telefono;
    private String ruc;
    private Integer idCategoria;
    private String logo;
    private String email;
    private String direccion;
    private Integer estado;
    public Integer getIdProveedor() {
        return idProveedor;
    }
    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }
    public String getNombreProveedor() {
        return nombreProveedor;
    }
    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getRuc() {
        return ruc;
    }
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    public Integer getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Integer getEstado() {
        return estado;
    }
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    @Override
    public String toString() {
        return "Proveedores [idProveedor=" + idProveedor + ", nombreProveedor=" + nombreProveedor + ", telefono="
                + telefono + ", ruc=" + ruc + ", idCategoria=" + idCategoria + ", logo=" + logo + ", email=" + email
                + ", direccion=" + direccion + ", estado=" + estado + "]";
    }

    

}
