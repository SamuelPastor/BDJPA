package ad.spring.data.repository;

import ad.spring.data.domain.DiarioCliente;
import ad.spring.data.domain.Tramite;

import java.util.List;

public interface DiarioClienteRepository {

    public List<DiarioCliente> findByTramite(Tramite tramite);
}
