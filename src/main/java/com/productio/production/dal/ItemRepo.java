package com.productio.production.dal;

import com.productio.production.models.ProductionItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<ProductionItem, Long> {
}
