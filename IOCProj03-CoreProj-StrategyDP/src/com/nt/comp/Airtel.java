//dependent class1

package com.nt.comp; 

public class Airtel implements IServiceProvider {

	@Override
	public String Connection(long phno) {
		return "Airtel Connection Created on Your phone with number "+phno;
	}
}
