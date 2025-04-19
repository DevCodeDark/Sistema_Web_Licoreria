package SipSoft.lic.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "codigo_barras")
public class Codigo_Barras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CodBarras;
    @Column(length = 255)
    private String nombreProd;

    public Integer getCodBarras() {
        return CodBarras;
    }
    public void setCodBarras(Integer codBarras) {
        CodBarras = codBarras;
    }
    public String getNombreProd() {
        return nombreProd;
    }
    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }
    @Override
    public String toString() {
        return "codigo_barra [CodBarras=" + CodBarras + ", nombreProd=" + nombreProd + "]";
    }
}
