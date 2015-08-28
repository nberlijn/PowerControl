package nl.nberlijn.powercontrol.persistence.repository;

import nl.nberlijn.powercontrol.core.persistence.repository.JAXBRepository;
import nl.nberlijn.powercontrol.persistence.models.Commands;

public class CommandsRepository extends JAXBRepository<Commands> {

    public CommandsRepository() {
        super(Commands.class);
    }

}
