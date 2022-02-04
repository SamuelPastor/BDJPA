package ad.spring.data.domain;

import javax.persistence.*;

@Entity
@Table(name="presupuesto")
public class Presupuesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPresupuesto")
    private int idPresupuesto;
    @Column(name = "lugarPresupuesto")
    private String lugarPresupuesto;
    @OneToOne
    @JoinColumn(name = "Tramite_idTramite")
    private Tramite tramite;

    public Presupuesto() {

    }

    public Presupuesto(String lugarPresupuesto) {
        this.lugarPresupuesto = lugarPresupuesto;
    }

    public Presupuesto(int idPresupuesto, String lugarPresupuesto, Tramite tramite) {
        this.idPresupuesto = idPresupuesto;
        this.lugarPresupuesto = lugarPresupuesto;
        this.tramite = tramite;
    }

    public int getIdPresupuesto() {
        return idPresupuesto;
    }

    public void setIdPresupuesto(int idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
    }

    public String getLugarPresupuesto() {
        return lugarPresupuesto;
    }

    public void setLugarPresupuesto(String lugarPresupuesto) {
        this.lugarPresupuesto = lugarPresupuesto;
    }

    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }
}
