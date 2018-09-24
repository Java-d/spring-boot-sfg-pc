package info.javadoff.model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Pet {

    private LocalDate birtDate;
    private PetType petType;
    private Owner owner;

    public LocalDate getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(LocalDate birtDate) {
        this.birtDate = birtDate;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
