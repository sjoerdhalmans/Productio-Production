package com.productio.production.dal;

import com.productio.production.models.ProductionBlueprint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlueprintRepo extends JpaRepository<ProductionBlueprint, Long> {
}
