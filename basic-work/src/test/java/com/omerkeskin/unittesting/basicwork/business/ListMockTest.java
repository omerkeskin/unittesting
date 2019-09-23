package com.omerkeskin.unittesting.basicwork.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.anyInt;

import java.util.List;
import org.junit.Test;
import org.mockito.ArgumentCaptor;


public class ListMockTest {
	List mockList = mock(List.class);

	@Test
	public void sizeBasic() {
		when(mockList.size()).thenReturn(5);
		assertEquals(5, mockList.size());
		verify(mockList, times(1)).size();
	}
	
	@Test
	public void returnDifferentValues() {		
		when(mockList.size()).thenReturn(5).thenReturn(10);
		assertEquals(5, mockList.size());
		assertEquals(10, mockList.size());
		verify(mockList, times(2)).size();
	}
	
	@Test
	public void returnWithParameters() {
		when(mockList.get(0)).thenReturn("deneme");
		assertEquals("deneme", mockList.get(0));
		assertEquals(null, mockList.get(1));
		verify(mockList).get(0);
		verify(mockList).get(1);
	}
	
	@Test
	public void returnWithGenericParameters() {
		when(mockList.get(anyInt())).thenReturn("deneme");
		assertEquals("deneme", mockList.get(0));
		assertEquals("deneme", mockList.get(1));
		verify(mockList).get(0);
		verify(mockList).get(1);
	}
	
	@Test
	public void argumentCapturing() {
		mockList.add("SomeString");
		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(mockList).add(captor.capture());
	}

}
