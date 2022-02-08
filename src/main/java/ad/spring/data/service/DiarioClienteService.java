package ad.spring.data.service;

import ad.spring.data.domain.DiarioCliente;
import ad.spring.data.domain.Tramite;
import ad.spring.data.repository.DiarioClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiarioClienteService {

    private final DiarioClienteRepository repository;

    @Autowired
    public  DiarioClienteService(DiarioClienteRepository repository) {
        this.repository = repository;
    }

    public List<DiarioCliente> getDiariosClienteByTramite(Tramite tramite) {
        return repository.findByTramite(tramite);
    }
}
