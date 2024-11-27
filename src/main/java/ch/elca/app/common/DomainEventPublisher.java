package ch.elca.app.common;

import org.jmolecules.event.types.DomainEvent;

public interface DomainEventPublisher {
    
    void publishEvent(DomainEvent event);

}
