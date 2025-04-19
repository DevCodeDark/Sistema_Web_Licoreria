package SipSoft.lic.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ventas_pago")

public class Ventas_Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idVentaPago;
    @Column(precision = 6, scale = 2, nullable = false)
    private Integer montoPagar;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idventa", nullable = false)
    private Ventas venta;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idTipoPago", nullable = false)
    private Tipo_Pago tipo_pago;

    public Integer getIdVentaPago() {
        return idVentaPago;
    }
    public void setIdVentaPago(Integer idVentaPago) {
        this.idVentaPago = idVentaPago;
    }
    public Integer getMontoPagar() {
        return montoPagar;
    }
    public void setMontoPagar(Integer montoPagar) {
        this.montoPagar = montoPagar;
    }
    public Ventas getVenta() {
        return venta;
    }
    public void setVenta(Ventas venta) {
        this.venta = venta;
    }
    public Tipo_Pago getTipo_pago() {
        return tipo_pago;
    }
    public void setTipo_pago(Tipo_Pago tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    @Override
    public String toString() {
        return "Ventas_Pago [idVentaPago=" + idVentaPago + ", montoPagar=" + montoPagar + ", venta=" + venta
                + ", tipo_pago=" + tipo_pago + "]";
    }
}
