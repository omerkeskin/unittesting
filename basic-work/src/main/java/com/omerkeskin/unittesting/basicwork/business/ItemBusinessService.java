package com.omerkeskin.unittesting.basicwork.business;

import org.springframework.stereotype.Service;

import com.omerkeskin.unittesting.basicwork.model.Item;

@Service
public class ItemBusinessService {

	public Item retrieveHardCodedItem() {
		return new Item(1, "Ball", 10, 100);
	}

}
