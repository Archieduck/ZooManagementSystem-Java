package org.softwire.training.zoo.services;

import org.softwire.training.zoo.models.*;

import java.util.List;

public class CleaningScheduler {

    private static CleaningScheduler instance;

    private CleaningScheduler() {
    }

    public static CleaningScheduler getInstance() {
        if (instance == null) {
            instance = new CleaningScheduler();
        }
        return instance;
    }

    public void assignCleaningJobs(List<Keeper<? extends Animal>> keepers) {
        keepers.forEach(keeper -> keeper.getResponsibleAnimals().forEach(animal -> {
            if (animal instanceof CanHaveMuckSwept) {
                keeper.muckOut((CanHaveMuckSwept) animal);
            }
        }));

    }
}
