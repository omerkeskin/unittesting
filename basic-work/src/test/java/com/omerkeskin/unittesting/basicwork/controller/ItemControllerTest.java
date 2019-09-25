package com.omerkeskin.unittesting.basicwork.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import com.omerkeskin.unittesting.basicwork.business.ItemBusinessService;
import com.omerkeskin.unittesting.basicwork.model.Item;

@RunWith(SpringRunner.class)
@WebMvcTest(ItemController.class)
public class ItemControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ItemBusinessService businessService;

	@Test
	public void testDummyItem() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("/dummy-item").
                accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(request)
								.andExpect(status().isOk())
								.andExpect(content().json("{\"id\": 1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}"))
								.andReturn();
	}
	
	@Test
	public void testItemFromBusinessService() throws Exception {
		
		when(businessService.retrieveHardCodedItem()).thenReturn(new Item(2, "watch", 500, 20));
		
		RequestBuilder request = MockMvcRequestBuilders.get("/item-from-business-service").
                accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(request)
								.andExpect(status().isOk())
								.andExpect(content().json("{\"id\": 2,\"name\":\"watch\",\"price\":500,\"quantity\":20}"))
								.andReturn();
		
		verify(businessService, times(1)).retrieveHardCodedItem();
	}

}
