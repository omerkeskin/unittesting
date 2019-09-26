package com.omerkeskin.unittesting.basicwork.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.omerkeskin.unittesting.basicwork.model.Item;


@RunWith(SpringRunner.class)
@DataJpaTest
public class IItemRepositoryTest {
	
	@Autowired
	private IItemRepository itemRepository;

	@Test
	public void testFindAll() {
		List<Item> lists = itemRepository.findAll();
		assertEquals(3, lists.size());
	}

}
