package com.ecabisrael.ecabdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Customer name must not be blank")
    private String customerName;

    @NotNull(message = "Booking date and time must not be null")
    private LocalDateTime bookingDateTime;

    // Getters and Setters
}
