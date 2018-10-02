package demo.springframework.springpetclinic.services;

import demo.springframework.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);

    Owner findByName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
