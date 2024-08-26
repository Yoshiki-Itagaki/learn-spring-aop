package com.in28minutes.learn_spring_aop.aopexample.data;

import org.springframework.stereotype.Repository;

import com.in28minutes.learn_spring_aop.aopexample.annotations.TrackTime;

@Repository
public class DataService2 {
	
	@TrackTime
	public int[] retrieveData() {
		
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new int[] {111, 222, 333, 444, 555};
	}

}
