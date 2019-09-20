package com.omerkeskin.unittesting.basicwork.business;

import static org.junit.Assert.*;

import org.junit.Test;

import com.omerkeskin.unittesting.basicwork.data.SomeDataService;

public class SomeBusinessImplTest {

	@Test
	public void testCalculateSumUsingDataService() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDataService(new SomeDataServiceStub());
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 6;
		assertEquals(expectedResult, expectedResult);
	}
	
	@Test
	public void testCalculateSum() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualResult = business.calculateSum(new int[] {1,2,3});
		int expectedResult = 6;
		assertEquals(expectedResult, expectedResult);
	}

}

class SomeDataServiceStub implements SomeDataService{

	@Override
	public int[] retrieveSomeData() {
		return new int [] {1,2,3};
	}
	
}