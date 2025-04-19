package SipSoft.lic.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contratos_proveedores")
public class Contratos_Proveedores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContrato;
    private String contrato_pdf;
    private LocalDate fecha_inicio;
    private LocalDate fecha_vencimiento;
    @Column(length = 255)
    private String detalles;
    private Integer estado = 1;
    private Integer idProveedor;
    
    public Integer getIdContrato() {
        return idContrato;
    }
    public void setIdContrato(Integer idContrato) {
        this.idContrato = idContrato;
    }
    public String getContrato_pdf() {
        return contrato_pdf;
    }
    public void setContrato_pdf(String contrato_pdf) {
        this.contrato_pdf = contrato_pdf;
    }
    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }
    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }
    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }
    public String getDetalles() {
        return detalles;
    }
    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
    public Integer getEstado() {
        return estado;
    }
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    public Integer getIdProveedor() {
        return idProveedor;
    }
    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }
    @Override
    public String toString() {
        return "Contratos_Proveedores [idContrato=" + idContrato + ", contrato_pdf=" + contrato_pdf + ", fecha_inicio="
                + fecha_inicio + ", fecha_vencimiento=" + fecha_vencimiento + ", detalles=" + detalles + ", estado="
                + estado + ", idProveedor=" + idProveedor + "]";
    }
}
