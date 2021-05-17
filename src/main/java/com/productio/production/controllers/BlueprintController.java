package com.productio.production.controllers;

import com.productio.production.logic.ProductionBlueprintLogic;
import com.productio.production.models.ProductionBlueprint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api", produces = MediaType.APPLICATION_JSON_VALUE)
public class BlueprintController {
    @Autowired
    ProductionBlueprintLogic productionBlueprintLogic;

    //these are added straight in the database
    @GetMapping(value = "/getAllBlueprints")
    public List<ProductionBlueprint> getAll() {
        return productionBlueprintLogic.getAll();
    }
}
