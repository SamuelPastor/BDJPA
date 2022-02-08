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
 * QInmueble is a Querydsl query type for Inmueble
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QInmueble extends EntityPathBase<Inmueble> {

    private static final long serialVersionUID = -1807120481L;

    public static final QInmueble inmueble = new QInmueble("inmueble");

    public final StringPath domicilio = createString("domicilio");

    public final NumberPath<Integer> idInmueble = createNumber("idInmueble", Integer.class);

    public final ListPath<Imagen, QImagen> imagenes = this.<Imagen, QImagen>createList("imagenes", Imagen.class, QImagen.class, PathInits.DIRECT2);

    public final StringPath tipo = createString("tipo");

    public QInmueble(String variable) {
        super(Inmueble.class, forVariable(variable));
    }

    public QInmueble(Path<? extends Inmueble> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInmueble(PathMetadata metadata) {
        super(Inmueble.class, metadata);
    }

}

