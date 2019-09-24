package com.omerkeskin.unittesting.basicwork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omerkeskin.unittesting.basicwork.model.Item;

@RestController
public class ItemController {
	
	@GetMapping("/dummy-item")
	public Item dummyItem() {
		return new Item(1, "Ball", 10, 100);
	}

}
