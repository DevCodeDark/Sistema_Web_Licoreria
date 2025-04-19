package SipSoft.lic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="tipo_compra")

public class Tipo_Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idTipoCompra;
    private String nombreTipoCompra;
    public Integer getIdTipoCompra() {
        return idTipoCompra;
    }
    public void setIdTipoCompra(Integer idTipoCompra) {
        this.idTipoCompra = idTipoCompra;
    }
    public String getNombreTipoCompra() {
        return nombreTipoCompra;
    }
    public void setNombreTipoCompra(String nombreTipoCompra) {
        this.nombreTipoCompra = nombreTipoCompra;
    }
    @Override
    public String toString() {
        return "Tipo_Compra [idTipoCompra=" + idTipoCompra + ", nombreTipoCompra=" + nombreTipoCompra + "]";
    }

    
    

}
