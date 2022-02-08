package ad.spring.data.domain.querydsl;

import static com.querydsl.core.types.PathMetadataFactory.*;

import ad.spring.data.domain.DiarioCliente;
import ad.spring.data.domain.Tramite;
import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTramite is a Querydsl query type for Tramite
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTramite extends EntityPathBase<Tramite> {

    private static final long serialVersionUID = -583603212L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTramite tramite = new QTramite("tramite");

    public final SetPath<DiarioCliente, QDiarioCliente> diarioCliente = this.<DiarioCliente, QDiarioCliente>createSet("diarioCliente", DiarioCliente.class, QDiarioCliente.class, PathInits.DIRECT2);

    public final DateTimePath<java.sql.Timestamp> fechaTramite = createDateTime("fechaTramite", java.sql.Timestamp.class);

    public final NumberPath<Integer> idTramite = createNumber("idTramite", Integer.class);

    protected QPresupuesto presupuesto;

    public final StringPath tipoTramite = createString("tipoTramite");

    public QTramite(String variable) {
        this(Tramite.class, forVariable(variable), INITS);
    }

    public QTramite(Path<? extends Tramite> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTramite(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTramite(PathMetadata metadata, PathInits inits) {
        this(Tramite.class, metadata, inits);
    }

    public QTramite(Class<? extends Tramite> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.presupuesto = inits.isInitialized("presupuesto") ? new QPresupuesto(forProperty("presupuesto"), inits.get("presupuesto")) : null;
    }

    public QPresupuesto presupuesto() {
        if (presupuesto == null) {
            presupuesto = new QPresupuesto(forProperty("presupuesto"));
        }
        return presupuesto;
    }

}

