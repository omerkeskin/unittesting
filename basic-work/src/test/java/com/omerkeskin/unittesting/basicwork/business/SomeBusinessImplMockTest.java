package com.omerkeskin.unittesting.basicwork.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.omerkeskin.unittesting.basicwork.data.SomeDataService;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessImplMockTest {
	
	@InjectMocks
	SomeBusinessImpl business ;
	
	@Mock
	SomeDataService dataServiceMock;

	@Test
	public void testSetSomeDataService() {
		//fail("Not yet implemented");
	}

	@Test
	public void testCalculateSumUsingDataService() {
		when(dataServiceMock.retrieveSomeData()).thenReturn(new int[] {2,4});				
		assertEquals(6, business.calculateSumUsingDataService());
		verify(dataServiceMock).retrieveSomeData();
	}

	@Test
	public void testCalculateSum() {
		//fail("Not yet implemented");
	}
	
	

}
