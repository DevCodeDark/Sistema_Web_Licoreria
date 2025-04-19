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
@Table(name = "ventas")

public class Ventas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer idVenta;
    private LocalDateTime fechaVenta;
    private Integer estado = 1;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idDestino", nullable = false)
    private Destinos destino;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuarios usuario;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCliente", nullable = false)
    private Clientes cliente;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idEmpresa", nullable = false)
    private Empresas empresa;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idTipoTransaccion", nullable = false)
    private Tipo_Transaccion tipo_transaccion;
    
    public Integer getIdVenta() {
        return idVenta;
    }
    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }
    public LocalDateTime getFechaVenta() {
        return fechaVenta;
    }
    public void setFechaVenta(LocalDateTime fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    public Integer getEstado() {
        return estado;
    }
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    public Destinos getDestino() {
        return destino;
    }
    public void setDestino(Destinos destino) {
        this.destino = destino;
    }
    public Usuarios getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
    public Clientes getCliente() {
        return cliente;
    }
    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }
    public Empresas getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresas empresa) {
        this.empresa = empresa;
    }
    public Tipo_Transaccion getTipo_transaccion() {
        return tipo_transaccion;
    }
    public void setTipo_transaccion(Tipo_Transaccion tipo_transaccion) {
        this.tipo_transaccion = tipo_transaccion;
    }
    @Override
    public String toString() {
        return "Ventas [idVenta=" + idVenta + ", fechaVenta=" + fechaVenta + ", estado=" + estado + ", destino="
                + destino + ", usuario=" + usuario + ", cliente=" + cliente + ", empresa=" + empresa
                + ", tipo_transaccion=" + tipo_transaccion + "]";
    }

    
}
