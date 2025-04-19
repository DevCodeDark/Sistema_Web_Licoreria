package SipSoft.lic.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes_frecuentes")
public class Clientes_Frecuentes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    @Column(columnDefinition = "CHAR(11)", nullable = false)
    private Integer numDoc;
    private Integer tipoDoc;
    
    public Integer getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public Integer getNumDoc() {
        return numDoc;
    }
    public void setNumDoc(Integer numDoc) {
        this.numDoc = numDoc;
    }
    public Integer getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(Integer tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    @Override
    public String toString() {
        return "Clientes_Frecuentes [idCliente=" + idCliente + ", numDoc=" + numDoc + ", tipoDoc=" + tipoDoc + "]";
    }
}
