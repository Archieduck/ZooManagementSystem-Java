package org.softwire.training.zoo.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Zebra extends AnimalThatCanBeGroomed implements LargeAnimal, CanHaveMuckSwept {

    private LocalDate lastMuckedOut;

    public Zebra(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}; Last Groomed {1}; Last mucked out {2}", super.toString(), super.getLastGroomed(), lastMuckedOut);
    }

    @Override
    public void muckOut() { lastMuckedOut = LocalDate.now(); }
}
