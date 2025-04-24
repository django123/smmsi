package eu.estreem.gcase.service;

import eu.estreem.gcase.domain.GrossCreditAndSchemeFeesEvent;
import eu.estreem.gcase.exception.PublishingException;


public interface EventPublisherService {

    void publishEvent(String eventId,GrossCreditAndSchemeFeesEvent event) throws PublishingException;

}
