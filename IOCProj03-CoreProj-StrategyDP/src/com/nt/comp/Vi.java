//dependent class2

package com.nt.comp;      

public class Vi implements IServiceProvider {
	@Override
	public String Connection(long phno) 
	{
		return "Vi Connection Created on Your phone with number "+phno;
	}
}
