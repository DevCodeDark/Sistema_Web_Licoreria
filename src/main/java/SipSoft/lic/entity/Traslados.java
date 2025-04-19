package SipSoft.lic.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="traslados")

public class Traslados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idTraslado;
    private LocalDateTime fechaTraslado;
    private Integer idEmpresa;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idEmpresa", nullable = false)
    private Empresas empresa;
    public Integer getIdTraslado() {
        return idTraslado;
    }
    public void setIdTraslado(Integer idTraslado) {
        this.idTraslado = idTraslado;
    }
    public LocalDateTime getFechaTraslado() {
        return fechaTraslado;
    }
    public void setFechaTraslado(LocalDateTime fechaTraslado) {
        this.fechaTraslado = fechaTraslado;
    }
    public Integer getIdEmpresa() {
        return idEmpresa;
    }
    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public Empresas getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresas empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Traslados [idTraslado=" + idTraslado + ", fechaTraslado=" + fechaTraslado + ", idEmpresa=" + idEmpresa
                + ", empresa=" + empresa + "]";
    }

}
