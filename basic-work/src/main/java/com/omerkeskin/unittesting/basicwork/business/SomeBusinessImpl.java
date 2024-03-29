package com.omerkeskin.unittesting.basicwork.business;

import com.omerkeskin.unittesting.basicwork.data.SomeDataService;

public class SomeBusinessImpl {
		
	private SomeDataService someDataService;
	
	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}

	public int calculateSumUsingDataService() {
		int sum = 0 ;		
		int [] data = someDataService.retrieveSomeData();
		
		for(int value : data) {
			sum+=value;
		}
		return sum;
	}
	
	public int calculateSum(int [] data) {
		int sum = 0 ;
		for(int value : data) {
			sum+=value;
		}
		return sum;
	}

}
