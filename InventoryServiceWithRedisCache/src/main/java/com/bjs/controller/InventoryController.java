package com.bjs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bjs.model.Inventory;
import com.bjs.service.InventoryService;

@SuppressWarnings("unused")
@RestController

public class InventoryController {

	@Autowired
	private InventoryService inventoryService;

	private static final Logger LOGGER =  LoggerFactory.getLogger(InventoryController.class);
	
	
	@RequestMapping("/inventory/sku/{skuId}")
	//@Cacheable("getInventoryBySku")
	public Inventory getInventoryBySku(@PathVariable String skuId ) {

		LOGGER.info("InventoryMS InventoryController's skuId=" + skuId);

		return inventoryService.getInventoryDetails(skuId);

	}

}
