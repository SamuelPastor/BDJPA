package ad.spring.data.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="imagen")
public class Imagen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idImagen")
    private int idImagen;
    @Column(name = "url")
    private String url;
    @Column(name = "fechaCreacion")
    private Timestamp fechaCreacion;
    @ManyToMany(mappedBy = "imagenes")
    private List<Inmueble> inmuebles = new ArrayList<>();

    public Imagen() {
    }

    public Imagen(String url, Timestamp fechaCreacion) {
        this.url = url;
        this.fechaCreacion = fechaCreacion;
    }

    public Imagen(int idImagen, String url, Timestamp fechaCreacion) {
        this.idImagen = idImagen;
        this.url = url;
        this.fechaCreacion = fechaCreacion;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(List<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }
}
