package hu.soldierValidation.controllers;

import hu.soldierValidation.domain.Soldier;
import hu.soldierValidation.services.SoldierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/soldiers")
public class SoldierController {

    private SoldierService service;

    @Autowired
    public void setService(SoldierService service) {
        this.service = service;
    }


    @GetMapping("")
    public List<Soldier> getSoldiers(){
        return service.getSoldiers();
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Soldier addSoldier(@RequestBody Soldier soldier){
        return service.addSoldier(soldier);
    }

}
