package com.cg.test;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.cg.demo.Marks;
import com.cg.demo.StudentMockDemo;


	public class StudentMockTest {
		StudentMockDemo sd;
				
				@Before
				public void setup(){
					sd=new StudentMockDemo();
					sd.setName("Ashwini");
					List<Marks> listOfMarks=new ArrayList<Marks>();
					Marks i1=Mockito.mock(Marks.class);
				    Marks i2=Mockito.mock(Marks.class);
					Marks i3=Mockito.mock(Marks.class);
					listOfMarks.add(i1);
					listOfMarks.add(i2);
					listOfMarks.add(i3);
					
					sd.setListOfItems(listOfMarks);
					when(i1.getName()).thenReturn("Ashwini");
					when(i2.getName()).thenReturn("Anitha");
					when(i3.getName()).thenReturn("Ram");
					when(i1.getMark("Ashwini")).thenReturn(100);
					when(i2.getMark("Anitha")).thenReturn(90);
					when(i3.getMark("Ram")).thenReturn(80);
					
				}
				
				
				@Test
				public void test_StudentMockDemo_StudentMockTest()
				{
					int totalMark=sd.calculateMark();
					Assert.assertEquals(270, totalMark);
				}
			
}
