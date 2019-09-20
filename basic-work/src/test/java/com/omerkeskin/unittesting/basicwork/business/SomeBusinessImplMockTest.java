package com.omerkeskin.unittesting.basicwork.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.omerkeskin.unittesting.basicwork.data.SomeDataService;

public class SomeBusinessImplMockTest {

	@Test
	public void testSetSomeDataService() {
		//fail("Not yet implemented");
	}

	@Test
	public void testCalculateSumUsingDataService() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		SomeDataService dataServiceMock = mock(SomeDataService.class);
		when(dataServiceMock.retrieveSomeData()).thenReturn(new int[] {2,4});
				
		business.setSomeDataService(dataServiceMock);
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 6;
		verify(dataServiceMock, times(1)).retrieveSomeData();
		assertEquals(expectedResult, expectedResult);
	}

	@Test
	public void testCalculateSum() {
		//fail("Not yet implemented");
	}

}
