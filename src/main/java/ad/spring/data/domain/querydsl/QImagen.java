package ad.spring.data.domain.querydsl;

import static com.querydsl.core.types.PathMetadataFactory.*;

import ad.spring.data.domain.Imagen;
import ad.spring.data.domain.Inmueble;
import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QImagen is a Querydsl query type for Imagen
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QImagen extends EntityPathBase<Imagen> {

    private static final long serialVersionUID = -2139485393L;

    public static final QImagen imagen = new QImagen("imagen");

    public final DateTimePath<java.sql.Timestamp> fechaCreacion = createDateTime("fechaCreacion", java.sql.Timestamp.class);

    public final NumberPath<Integer> idImagen = createNumber("idImagen", Integer.class);

    public final ListPath<Inmueble, QInmueble> inmuebles = this.<Inmueble, QInmueble>createList("inmuebles", Inmueble.class, QInmueble.class, PathInits.DIRECT2);

    public final StringPath url = createString("url");

    public QImagen(String variable) {
        super(Imagen.class, forVariable(variable));
    }

    public QImagen(Path<? extends Imagen> path) {
        super(path.getType(), path.getMetadata());
    }

    public QImagen(PathMetadata metadata) {
        super(Imagen.class, metadata);
    }

}

