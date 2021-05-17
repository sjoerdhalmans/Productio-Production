package com.productio.production.logic;

import com.productio.production.dal.BlueprintRepo;
import com.productio.production.models.ProductionBlueprint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductionBlueprintLogic {
    @Autowired
    BlueprintRepo blueprintRepo;

    public List<ProductionBlueprint> getAll() {
        return blueprintRepo.findAll();
    }
}
