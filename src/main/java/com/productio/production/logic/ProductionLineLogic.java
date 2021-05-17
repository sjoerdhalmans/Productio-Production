package com.productio.production.logic;

import com.productio.production.dal.ProductionLineRepo;
import com.productio.production.models.ProductionLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductionLineLogic {
    @Autowired
    ProductionLineRepo productionLineRepo;

    public List<ProductionLine> getAll() {
        return productionLineRepo.findAll();
    }
}
