package com.productio.production.controllers;

import com.productio.production.logic.ProductionItemLogic;
import com.productio.production.models.ProductionItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ItemController {
    @Autowired
    ProductionItemLogic productionItemLogic;

    //these are added straight in the database
    @GetMapping(value = "/getAllItems")
    public List<ProductionItem> getAll() {
        return productionItemLogic.getAll();
    }
}
