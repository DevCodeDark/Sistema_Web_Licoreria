package SipSoft.lic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="transacciones")

public class Transacciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idTransaccion;
    private String nombre;
    
    public Integer getIdTransaccion() {
        return idTransaccion;
    }
    public void setIdTransaccion(Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Transacciones [idTransaccion=" + idTransaccion + ", nombre=" + nombre + "]";
    }
}
