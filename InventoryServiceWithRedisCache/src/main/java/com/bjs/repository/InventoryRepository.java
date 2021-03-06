package com.bjs.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.bjs.model.Inventory;

public interface InventoryRepository extends MongoRepository<Inventory, String> {

	@Cacheable("findBySku")
	public Inventory findBySku(String sku);
}
