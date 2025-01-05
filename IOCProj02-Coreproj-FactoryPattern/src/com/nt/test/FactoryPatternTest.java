//StrategyDpTestMain.java(Client app)
package com.nt.test;

import com.nt.comp.IServiceProvider;
import com.nt.factory.MobileSimFactory;
public class FactoryPatternTest {

	public static void main(String[] args) {
		IServiceProvider isp=MobileSimFactory.getInstance("vi");
		
		String result=isp.Connection();
		
		System.out.println(result);	
	}
}
