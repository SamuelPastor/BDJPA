package ad.spring.data.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name="tramite")
public class Tramite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTramite")
    private int idTramite;
    @Column(name = "tipoTramite")
    private String tipoTramite;
    @Column(name = "fechaTramite")
    private Timestamp fechaTramite;
    @OneToOne(mappedBy = "tramite", cascade = CascadeType.REMOVE)
    private  Presupuesto presupuesto;
    @OneToMany(mappedBy = "tramite")
    private Set<DiarioCliente> diarioCliente;

    public Tramite() {
    }

    public Tramite(int idTramite, String tipoTramite, Timestamp fechaTramite) {
        this.idTramite = idTramite;
        this.tipoTramite = tipoTramite;
        this.fechaTramite = fechaTramite;
    }
    public Tramite(String tipoTramite, Timestamp fechaTramite) {
        this.tipoTramite = tipoTramite;
        this.fechaTramite = fechaTramite;
    }

    public int getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(int idTramite) {
        this.idTramite = idTramite;
    }

    public String getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public Timestamp getFechaTramite() {
        return fechaTramite;
    }

    public void setFechaTramite(Timestamp fechaTramite) {
        this.fechaTramite = fechaTramite;
    }

    public void setPresupuesto(Presupuesto presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Presupuesto getPresupuesto() {
        return presupuesto;
    }

    public Set<DiarioCliente> getDiarioCliente() {
        return diarioCliente;
    }

    public void setDiarioCliente(Set<DiarioCliente> diarioCliente) {
        this.diarioCliente = diarioCliente;
    }
}