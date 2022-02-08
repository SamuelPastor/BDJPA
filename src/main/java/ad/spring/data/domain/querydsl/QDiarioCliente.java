package ad.spring.data.domain.querydsl;

import static com.querydsl.core.types.PathMetadataFactory.*;

import ad.spring.data.domain.DiarioCliente;
import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDiarioCliente is a Querydsl query type for DiarioCliente
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDiarioCliente extends EntityPathBase<DiarioCliente> {

    private static final long serialVersionUID = -1462501630L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDiarioCliente diarioCliente = new QDiarioCliente("diarioCliente");

    public final StringPath entradaDiario = createString("entradaDiario");

    public final DateTimePath<java.sql.Timestamp> fecha = createDateTime("fecha", java.sql.Timestamp.class);

    public final NumberPath<Integer> idDiarioCliente = createNumber("idDiarioCliente", Integer.class);

    protected QTramite tramite;

    public QDiarioCliente(String variable) {
        this(DiarioCliente.class, forVariable(variable), INITS);
    }

    public QDiarioCliente(Path<? extends DiarioCliente> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDiarioCliente(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDiarioCliente(PathMetadata metadata, PathInits inits) {
        this(DiarioCliente.class, metadata, inits);
    }

    public QDiarioCliente(Class<? extends DiarioCliente> type, PathMetadata metadata, PathInits inits) {
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

