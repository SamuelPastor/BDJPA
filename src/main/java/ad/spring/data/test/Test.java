package ad.spring.data.test;

import ad.spring.data.domain.DiarioCliente;
import ad.spring.data.domain.Tramite;
import ad.spring.data.repository.TramiteRepository;
import ad.spring.data.service.DiarioClienteService;
import ad.spring.data.service.TramiteService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml")) {
            TramiteService tramiteService = context.getBean(TramiteService.class);
            DiarioClienteService diarioClienteService = context.getBean(DiarioClienteService.class);
            Optional<Tramite> tramite = tramiteService.load(2);
            List<DiarioCliente> dcs = diarioClienteService.getDiariosClienteByTramite(tramite.get());
            for (DiarioCliente diario : dcs) {
                System.out.println(diario.toString());
            }
            /*tramiteService.deleteByTipoTramite("Proyecto JPA");
            List<Tramite> tramites = tramiteService.findFechaTramiteLessThan("2022-12-15 00:00:00");
            for (Tramite tramite : tramites) {
                System.out.println(tramite.toString());
            }
            tramiteService.load(1).ifPresent(System.out::println);
            System.out.println(tramiteService.exists(1));
            Tramite tramite = new Tramite("Proyecto JPA", new Timestamp(new Date().getTime()));
            tramiteService.create(tramite);*/
        }
    }
}