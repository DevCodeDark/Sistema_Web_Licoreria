package SipSoft.lic.entity;

<<<<<<< HEAD
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "destinos")
public class Destinos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDestino;
    private Integer codUbigeo;
    @Column(length = 255)
    private String direccion;
    @Column(length = 255)
    private String referencia;
    
    public Integer getIdDestino() {
        return idDestino;
    }
    public void setIdDestino(Integer idDestino) {
        this.idDestino = idDestino;
    }
    public Integer getCodUbigeo() {
        return codUbigeo;
    }
    public void setCodUbigeo(Integer codUbigeo) {
        this.codUbigeo = codUbigeo;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    @Override
    public String toString() {
        return "Destinos [idDestino=" + idDestino + ", codUbigeo=" + codUbigeo + ", direccion=" + direccion
                + ", referencia=" + referencia + "]";
    }
=======
public class Destinos {
    
>>>>>>> 0d134b1f38c4c52337fa8f0ee8dec9c40afec9d9
}
