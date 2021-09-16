package info.danbecker.jpaexamples.inheritance.onetableperclass;

import javax.persistence.Entity;

@Entity
class Car extends Vehicle {
    private boolean runOnLpg;

    public boolean runOnLpg() {
        return runOnLpg;
    }
}
