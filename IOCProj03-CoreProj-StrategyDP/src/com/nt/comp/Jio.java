//dependent class3

package com.nt.comp;             

public class Jio implements IServiceProvider {
	@Override
	public String Connection(long phno) {

		return "Jio Connection Created on Your phone with number "+phno;
	}
}
