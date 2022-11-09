package org.softwire.training.zoo.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GuineaFowl extends AbstractAnimal implements SmallAnimal, CanBeGroomed, CanHaveMuckSwept {

    private LocalDateTime lastGroomed;
    private LocalDateTime lastMucked;

    public GuineaFowl(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }

    @Override
    public void feed() {
        System.out.println("<Munch munch>");
        super.feed();
    }

    @Override
    public void groom() {
        lastGroomed = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}; Last Groomed {1}", super.toString(), lastGroomed);
    }

    @Override
    public void muckOut() { lastMucked = LocalDateTime.now(); }
}
