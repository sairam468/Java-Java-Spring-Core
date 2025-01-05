//StrategyDpTestMain.java(Client app)
package com.nt.test;

import com.nt.cfgs.MobileSimFactory;
import com.nt.comp.Mobile;
public class StrategyDpTestMain {

	public static void main(String[] args) {
		Mobile m=MobileSimFactory.getInstance("Jio");
		
		String result=m.NetworkUsage(new String[] {"call","data","message"});
		
		System.out.println(result);
		
		//IServiceProvider isp=MobileSimFactory.getInstance("vi");
	}
}
