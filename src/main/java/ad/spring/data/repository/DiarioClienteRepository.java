package ad.spring.data.repository;

import ad.spring.data.domain.DiarioCliente;
import ad.spring.data.domain.Tramite;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DiarioClienteRepository extends CrudRepository<DiarioCliente, Integer> {

    List<DiarioCliente> findByTramite(Tramite tramite);

    List<DiarioCliente> findByTramite_TipoTramite(String tipoTramite);
}