package org.softwire.training.zoo.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Rabbit extends AnimalThatCanBeGroomed implements SmallAnimal, CanHaveMuckSwept {

    private LocalDate lastMuckedOut;

    public Rabbit(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }

    @Override
    public void feed() {
        System.out.println("<Munch munch>");
        super.feed();
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}; Last Groomed {1}; Last mucked out {2}", super.toString(), super.getLastGroomed(), lastMuckedOut);
    }

    @Override
    public void muckOut() { lastMuckedOut = LocalDate.now(); }
}
