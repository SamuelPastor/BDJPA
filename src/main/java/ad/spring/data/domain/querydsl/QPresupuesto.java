package ad.spring.data.domain.querydsl;

import static com.querydsl.core.types.PathMetadataFactory.*;

import ad.spring.data.domain.Presupuesto;
import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPresupuesto is a Querydsl query type for Presupuesto
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPresupuesto extends EntityPathBase<Presupuesto> {

    private static final long serialVersionUID = 822498423L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPresupuesto presupuesto = new QPresupuesto("presupuesto");

    public final NumberPath<Integer> idPresupuesto = createNumber("idPresupuesto", Integer.class);

    public final StringPath lugarPresupuesto = createString("lugarPresupuesto");

    protected QTramite tramite;

    public QPresupuesto(String variable) {
        this(Presupuesto.class, forVariable(variable), INITS);
    }

    public QPresupuesto(Path<? extends Presupuesto> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPresupuesto(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPresupuesto(PathMetadata metadata, PathInits inits) {
        this(Presupuesto.class, metadata, inits);
    }

    public QPresupuesto(Class<? extends Presupuesto> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.tramite = inits.isInitialized("tramite") ? new QTramite(forProperty("tramite"), inits.get("tramite")) : null;
    }

    public QTramite tramite() {
        if (tramite == null) {
            tramite = new QTramite(forProperty("tramite"));
        }
        return tramite;
    }

}

