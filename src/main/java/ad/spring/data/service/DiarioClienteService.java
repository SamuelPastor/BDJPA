package ad.spring.data.service;

import ad.spring.data.domain.DiarioCliente;
import ad.spring.data.domain.Tramite;
import ad.spring.data.domain.querydsl.QDiarioCliente;
import ad.spring.data.domain.querydsl.QTramite;
import ad.spring.data.repository.DiarioClienteRepository;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class DiarioClienteService {
    private final DiarioClienteRepository diarioClienteRepository;
    @Autowired
    private EntityManager em;
    @Autowired
    public  DiarioClienteService(DiarioClienteRepository repository) {
        this.diarioClienteRepository = repository;
    }

    public List<DiarioCliente> getDiariosClienteByTramite(Tramite tramite) {
        return diarioClienteRepository.findByTramite(tramite);
    }

    public List<DiarioCliente> findByTipoTramite(String tipoTramite) {
        QTramite qtramite = QTramite.tramite;
        QDiarioCliente qdiario = QDiarioCliente.diarioCliente;

        JPAQuery<DiarioCliente> query = new JPAQuery<DiarioCliente>(em)
                .select(qdiario)
                .from(qtramite)
                .join(qtramite.diarioCliente, qdiario)
                .where(qtramite.tipoTramite.eq(tipoTramite));
        return query.fetch();
    }
}
