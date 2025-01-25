//dependent class3

package com.sit.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("dtdc")
@Primary
public class Dtdc implements Courier {

	@Override
	public String deliver(int oid) {
		return oid+" Order items are kept for delievery by DTDC";
	}
}
