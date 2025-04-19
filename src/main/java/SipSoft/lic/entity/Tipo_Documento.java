package SipSoft.lic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="tipo_documento")

public class Tipo_Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idTipoDocumento;
    private String descripcion;
    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }
    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public String toString() {
        return "Tipo_Documento [idTipoDocumento=" + idTipoDocumento + ", descripcion=" + descripcion + "]";
    }

      
    
    
    

}
