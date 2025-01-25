//MobileSimFactory.java(Factory Pattern)

package com.nt.cfgs;

import com.nt.comp.Airtel;
import com.nt.comp.IServiceProvider;
import com.nt.comp.Jio;
import com.nt.comp.Mobile;
import com.nt.comp.Vi;

public class MobileSimFactory {

	public static Mobile getInstance(String simType) {
		//create dependent class obj
		IServiceProvider isp=null;

		if(simType.equalsIgnoreCase("airtel")) {
			isp=new Airtel();
		}
		else if(simType.equalsIgnoreCase("jio")) {
			isp=new Jio();
		}
		else if(simType.equalsIgnoreCase("vi")) {
			isp=new Vi();
		}
		else 
			System.err.println("Invalid ISP");

		Mobile m=new Mobile();
		m.setISP(isp);

		return  m;	
	}
}
