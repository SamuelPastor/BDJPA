package ad.spring.data.test;

import ad.spring.data.domain.Tramite;
import ad.spring.data.service.TramiteService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Timestamp;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml")) {
            TramiteService tramiteService = context.getBean(TramiteService.class);
            Tramite tramite = new Tramite("Proyecto JPA", new Timestamp(new Date().getTime()));
            tramiteService.create(tramite);
        }
    }
}
