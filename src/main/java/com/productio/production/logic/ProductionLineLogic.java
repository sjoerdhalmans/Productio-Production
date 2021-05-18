package com.productio.production.logic;

import com.productio.production.dal.ProductionLineRepo;
import com.productio.production.models.ProductionLine;
import com.productio.production.models.ProductionLineDTO;
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

    public void createProductionLine(ProductionLineDTO productionLineDTO) {
        ProductionLine productionLine = new ProductionLine(false, productionLineDTO.getProducedItemId(), productionLineDTO.getQuantityPerMinute());

        productionLineRepo.save(productionLine);
    }

    public void updateProductionLine(ProductionLine productionLine) {
        productionLineRepo.save(productionLine);
    }
}
