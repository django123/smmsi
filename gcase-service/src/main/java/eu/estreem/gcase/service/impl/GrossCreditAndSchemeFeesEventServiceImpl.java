package eu.estreem.gcase.service.impl;


import eu.estreem.gcase.domain.GrossCreditAndSchemeFeesEvent;
import eu.estreem.gcase.model.GrossCreditAndSchemeFeesEventDTO;
import eu.estreem.gcase.mapper.GrossCreditAndSchemeFeesEventMapper;
import eu.estreem.gcase.service.GrossCreditAndSchemeFeesEventService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GrossCreditAndSchemeFeesEventServiceImpl implements GrossCreditAndSchemeFeesEventService {

   /* private final GrossCreditAndSchemeFeesEventProducer eventProducer;

    @Autowired
    public GrossCreditAndSchemeFeesEventServiceImpl(GrossCreditAndSchemeFeesEventProducer eventProducer) {
        this.eventProducer = eventProducer;
    }*/

    @Override
    public void handleGrossCashFlowEvent(GrossCreditAndSchemeFeesEventDTO eventDto, String eventId) {
        log.info("Reception de l'evenement");
        GrossCreditAndSchemeFeesEvent event = GrossCreditAndSchemeFeesEventMapper.toKafkaModel(eventDto);
       // eventProducer.publish(event,eventId);

    }
}
