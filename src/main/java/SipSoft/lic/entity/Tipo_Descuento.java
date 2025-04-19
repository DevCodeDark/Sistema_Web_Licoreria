package SipSoft.lic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="tipo_descuento")

public class Tipo_Descuento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idTipoDescuento;
    private String descripcion;
    public Integer getIdTipoDescuento() {
        return idTipoDescuento;
    }
    public void setIdTipoDescuento(Integer idTipoDescuento) {
        this.idTipoDescuento = idTipoDescuento;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public String toString() {
        return "Tipo_Descuento [idTipoDescuento=" + idTipoDescuento + ", descripcion=" + descripcion + "]";
    }

     
    
    
    
    

}
