package eu.estreem.gcase.service;


import eu.estreem.gcase.model.GrossCreditAndSchemeFeesEventDTO;

public interface GrossCreditAndSchemeFeesEventService {

    void handleGrossCashFlowEvent(GrossCreditAndSchemeFeesEventDTO eventDto, String eventId);
}
