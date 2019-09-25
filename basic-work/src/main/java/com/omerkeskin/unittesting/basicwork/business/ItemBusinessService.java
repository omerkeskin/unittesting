package com.omerkeskin.unittesting.basicwork.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omerkeskin.unittesting.basicwork.model.Item;
import com.omerkeskin.unittesting.basicwork.repository.IItemRepository;

@Service
public class ItemBusinessService {
	
	@Autowired
	private IItemRepository itemRepository;

	public Item retrieveHardCodedItem() {
		return new Item(1, "Ball", 10, 100);
	}
	
	public List<Item> retrieveAllItems(){
		List<Item> items = itemRepository.findAll();
		for(Item item : items) {
			item.setValue(item.getPrice()*item.getQuantity());
		}
		
		
		return items;
	}

}
