//dependent class2

package com.sit.sbeans;

import org.springframework.stereotype.Component;

@Component("dhl")
public class Dhl implements Courier {

	@Override
	public String deliver(int oid) {
		return oid+" Order items are kept for delievery by DHL";
	}
}
