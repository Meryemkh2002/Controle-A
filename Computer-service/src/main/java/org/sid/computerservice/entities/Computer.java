package org.sid.computerservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPc;

    private String proce;
    private int ram;
    private int hardDrive;
    private double price;
    private String macAddress;
}
