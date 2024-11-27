package ch.elca.app.common;

import ch.elca.app.common.model.Command;

public interface CommandPublisher {
    
    void publishCommand(Command command);

}
