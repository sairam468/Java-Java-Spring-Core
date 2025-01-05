//dependent class1

package com.sit.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bDart")
public class BlueDart implements Courier {

	@Override
	public String deliver(int oid) {
		return oid+" Order items are kept for delievery by BlueDart";
	}
}
