package hu.soldierValidation.services;

import hu.soldierValidation.domain.Soldier;
import hu.soldierValidation.repositories.SoldierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoldierService {

    private SoldierRepository repository;


    @Autowired
    public void setRepository(SoldierRepository repository) {
        this.repository = repository;
    }


    public List<Soldier> getSoldiers() {
        return repository.findAll();
    }

    public Soldier addSoldier(Soldier soldier) {
        return repository.save(soldier);
    }


}
