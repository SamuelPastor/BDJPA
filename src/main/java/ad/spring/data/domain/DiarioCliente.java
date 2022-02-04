package ad.spring.data.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="diariocliente")
public class DiarioCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDiarioCliente")
    private int idDiarioCliente;
    @Column(name = "entradaDiario")
    private String entradaDiario;
    @Column(name = "fecha")
    private Timestamp fecha;
    @ManyToOne
    @JoinColumn(name = "Tramite_idTramite")
    private Tramite tramite;

    public DiarioCliente(int idDiarioCliente, String entradaDiario, Timestamp fecha, Tramite tramite) {
        this.idDiarioCliente = idDiarioCliente;
        this.entradaDiario = entradaDiario;
        this.fecha = fecha;
        this.tramite = tramite;
    }

    public DiarioCliente() {

    }

    public int getIdDiarioCliente() {
        return idDiarioCliente;
    }

    public void setIdDiarioCliente(int idDiarioCliente) {
        this.idDiarioCliente = idDiarioCliente;
    }

    public String getEntradaDiario() {
        return entradaDiario;
    }

    public void setEntradaDiario(String entradaDiario) {
        this.entradaDiario = entradaDiario;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }
}
