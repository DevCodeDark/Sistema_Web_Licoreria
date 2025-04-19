package SipSoft.lic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="unidad_medida")

public class Unidad_Medida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idUnidadMedida;
    private String nombre;
    public Integer getIdUnidadMedida() {
        return idUnidadMedida;
    }
    public void setIdUnidadMedida(Integer idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Unidad_Medida [idUnidadMedida=" + idUnidadMedida + ", nombre=" + nombre + "]";
    }

}
