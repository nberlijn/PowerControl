package nl.nberlijn.powercontrol.persistence.repository;

import nl.nberlijn.powercontrol.core.persistence.repository.XMLRepository;
import nl.nberlijn.powercontrol.persistence.models.Commands;

/**
 * Class representing the Commands Repository.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
public class CommandsRepository extends XMLRepository<Commands> {

    /**
     * A Commands Repository constructor.
     * Initializes the Superclass.
     */
    public CommandsRepository() {
        super("storage", Commands.class);
    }

}
