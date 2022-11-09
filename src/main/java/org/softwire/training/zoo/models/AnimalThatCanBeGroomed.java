package org.softwire.training.zoo.models;

import org.softwire.training.zoo.Config;

import java.text.MessageFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class AnimalThatCanBeGroomed extends AbstractAnimal implements CanBeGroomed {
    private LocalDate dateOfBirth;
    private LocalDateTime lastFed;
    private LocalDate lastGroomed;


    public AnimalThatCanBeGroomed(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }

    public Duration age() {
        return Duration.between(LocalDate.now(), dateOfBirth);
    }

    public LocalDate getLastGroomed() {
        return this.lastGroomed;
    }

    @Override
    public void groom() { this.lastGroomed = LocalDate.now(); }
}
