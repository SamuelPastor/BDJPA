package ad.spring.data.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="inmueble")
public class Inmueble {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInmueble")
    private int idInmueble;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "domicilio")
    private String domicilio;
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinTable(
            name = "inmuebleimagenmap",
            joinColumns = @JoinColumn(name = "idInmueble"),
            inverseJoinColumns = @JoinColumn(name = "idImagen")
    )
    private List<Imagen> imagenes = new ArrayList<>();

    public Inmueble() {
    }

    public Inmueble(String tipo, String domicilio) {
        this.tipo = tipo;
        this.domicilio = domicilio;
    }

    public Inmueble(int idInmueble, String tipo, String domicilio) {
        this.idInmueble = idInmueble;
        this.tipo = tipo;
        this.domicilio = domicilio;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public List<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<Imagen> imagenes) {
        this.imagenes = imagenes;
    }
}
