package ad.spring.data.service;

import ad.spring.data.domain.Tramite;
import ad.spring.data.repository.TramiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TramiteService {
    private final TramiteRepository tramiteRepository;

    @Autowired
    public TramiteService(TramiteRepository tramiteRepository) {
        this.tramiteRepository = tramiteRepository;
    }

    public void create(Tramite tramite) {
        tramiteRepository.save(tramite);
    }
}
