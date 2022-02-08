package ad.spring.data.service;

import ad.spring.data.domain.Tramite;
import ad.spring.data.repository.TramiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

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

    public Optional<Tramite> load(int id) {
        return tramiteRepository.findById(id);
    }

    public boolean exists(int id) {
        return tramiteRepository.existsById(id);
    }

    public List<Tramite> findTipoTramite(String tipoTramite) {
        return tramiteRepository.findByTipoTramiteLike("%" + tipoTramite + "%");
    }

    public List<Tramite> findFechaTramiteLessThan(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime date = LocalDateTime.parse(fecha, formatter);
        return tramiteRepository.findByFechaTramiteLessThan(Timestamp.valueOf(date));
    }

    public  Integer deleteByTipoTramite(String tipoTramite) {
        return tramiteRepository.deleteByTipoTramite(tipoTramite);
    }
}
