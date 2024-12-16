package org.sid.computerservice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString


public class ComputerDTO {
    private String proce;
    private int ram;
    private double price;
    private String hardDrive;
}
