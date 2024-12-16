package org.sid.computerservice.mapper;

import org.modelmapper.ModelMapper;
import org.sid.computerservice.entities.Computer;
import org.sid.computerservice.dto.ComputerDTO;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public Computer fromComputerDtoToComputer(ComputerDTO computerDTO) {
        return modelMapper.map(computerDTO, Computer.class);
    }

    public ComputerDTO fromComputerToComputerDto(Computer computer) {
        return modelMapper.map(computer, ComputerDTO.class);
    }
}

