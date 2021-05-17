package com.productio.production.logic;

import com.productio.production.dal.ItemRepo;
import com.productio.production.models.ProductionItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductionItemLogic {
    @Autowired
    ItemRepo productionItemRepo;

    public List<ProductionItem> getAll() {
        return productionItemRepo.findAll();
    }
}
