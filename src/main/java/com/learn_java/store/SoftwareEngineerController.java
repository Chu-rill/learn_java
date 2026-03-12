package com.learn_java.store;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private  final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
        return  softwareEngineerService.getAllSoftwareEngineers();
    }

    @GetMapping("{id}")
    public SoftwareEngineer getEngineerById(@PathVariable Integer id){
        return  softwareEngineerService.getSoftwareEngineerById(id);
    }

    @PostMapping
    public ResponseEntity<?> addNewSoftwareEngineer(@RequestBody UserRequest softwareEngineer){
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
