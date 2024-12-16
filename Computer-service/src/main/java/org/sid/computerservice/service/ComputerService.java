package org.sid.computerservice.service;

import org.sid.computerservice.entities.Computer;
import java.util.List;

public interface ComputerService {
    List<Computer> getComputersByProcessor(String proce);
    Computer saveComputer(Computer computer);
}
