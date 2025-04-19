package SipSoft.lic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="tipo_comprobante")

public class Tipo_Comprobante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idTipoComprobante;
    private String nombre;
    public Integer getIdTipoComprobante() {
        return idTipoComprobante;
    }
    public void setIdTipoComprobante(Integer idTipoComprobante) {
        this.idTipoComprobante = idTipoComprobante;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Tipo_Comprobante [idTipoComprobante=" + idTipoComprobante + ", nombre=" + nombre + "]";
    }

    
    
    
    

}
