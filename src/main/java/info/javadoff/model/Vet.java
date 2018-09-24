package info.javadoff.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.HashSet;

@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialities", joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns= @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities;

    protected void getSpecialitiesInternal(){
        if(this.specialities == null) {
            this.specialities = new HashSet<>();
        }
        return this.specialities;
    }

    protected void setSpecialitiesInternal(Set<Speciality> specialities){
        this.specialities = specialities;
    }

    @XmlElement
    public List<Speciality> getSpecialities(){
        List<Speciality> sortedSpecs = new ArrayList<>(getSpecialities())
    }

    public int getNrOfSpecialities(){
        return  this.specialities.size();
    }

    public void  addSpeciality(Speciality speciality){
        getSpecialitiesInternal().add(speciality);
    }
}
