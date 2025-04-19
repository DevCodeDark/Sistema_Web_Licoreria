package SipSoft.lic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="tipo_pago")

public class Tipo_Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idTipoPago;
    private String nombreTipoPago;

    public Integer getIdTipoPago() {
        return idTipoPago;
    }
    public void setIdTipoPago(Integer idTipoPago) {
        this.idTipoPago = idTipoPago;
    }
    public String getNombreTipoPago() {
        return nombreTipoPago;
    }
    public void setNombreTipoPago(String nombreTipoPago) {
        this.nombreTipoPago = nombreTipoPago;
    }
    
    @Override
    public String toString() {
        return "Tipo_Pago [idTipoPago=" + idTipoPago + ", nombreTipoPago=" + nombreTipoPago + "]";
    }
    
}
