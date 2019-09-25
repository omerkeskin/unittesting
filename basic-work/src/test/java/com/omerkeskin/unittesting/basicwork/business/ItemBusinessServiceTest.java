package com.omerkeskin.unittesting.basicwork.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.omerkeskin.unittesting.basicwork.model.Item;
import com.omerkeskin.unittesting.basicwork.repository.IItemRepository;

@RunWith(MockitoJUnitRunner.class)
public class ItemBusinessServiceTest {
	
	@InjectMocks
	private ItemBusinessService business;
	
	@Mock
	private IItemRepository itemRepository; 

	@Test
	public void testRetrieveHardCodedItem() {
		//fail("Not yet implemented");
	}

	@Test
	public void testRetrieveAllItems() {
		when(itemRepository.findAll()).thenReturn(Arrays.asList(new Item(10001, "Tag Heuer", 5000, 20),  
												                new Item(10002, "Philipe Patek", 5435300, 3),
												                new Item(10003, "Seiko", 320, 9000)));
		List<Item> items = business.retrieveAllItems();
		
		assertEquals(100000, items.get(0).getValue());
		assertEquals(16305900, items.get(1).getValue());
		assertEquals(2880000, items.get(2).getValue());
		verify(itemRepository).findAll();
	}

}
