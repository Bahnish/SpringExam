package com.example.exambaha.controllers;

import com.example.exambaha.entities.Sprint;
import com.example.exambaha.services.ISprintServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Sprint")
@RequiredArgsConstructor
public class SprintController {
    private final ISprintServices iSprintServices;
    @PostMapping("/ProjetID")
    public void addSprintAndAssignToProjet(@RequestBody Sprint sprint, @PathVariable int idProjet){
        iSprintServices.addSprintAndAssignToProjet(sprint,idProjet);
    };
}
