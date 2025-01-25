//Target class1

package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class Mobile {

	private IServiceProvider isp; //HAS-A Property

	public void setISP(IServiceProvider isp) {
		System.out.println("Mobile.setISP()");

		this.isp=isp;
	}

	public String NetworkUsage(String[] Operations) {
		for(String s:Operations) {
			System.out.println("Operation "+s+" performed");}
		long phno=new Random().nextLong(9000000000l) + 1000000000l;
		String msg=isp.Connection(phno);
		
		return Arrays.toString(Operations)+" opeartions performed...... \n"+msg;
	}
}
