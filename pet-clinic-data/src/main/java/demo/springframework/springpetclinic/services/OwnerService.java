package demo.springframework.springpetclinic.services;

import demo.springframework.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByName(String lastName);
}
