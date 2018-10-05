package demo.springframework.springpetclinic.services.map;

import demo.springframework.springpetclinic.model.Vet;
import demo.springframework.springpetclinic.services.VetService;

import java.util.Set;

//import demo.springframework.springpetclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
