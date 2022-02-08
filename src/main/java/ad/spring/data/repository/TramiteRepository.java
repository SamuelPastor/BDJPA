package ad.spring.data.repository;

import ad.spring.data.domain.Tramite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

public interface TramiteRepository extends CrudRepository<Tramite, Integer> {
    List<Tramite> findByTipoTramiteLike(String tipoTramite);
    List<Tramite> findByFechaTramiteLessThan(Timestamp fecha);
    @Transactional
    Integer deleteByTipoTramite(String tipoTramite);
}
