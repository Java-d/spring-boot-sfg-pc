package info.javadoff.petclinic.services;

import info.javadoff.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
