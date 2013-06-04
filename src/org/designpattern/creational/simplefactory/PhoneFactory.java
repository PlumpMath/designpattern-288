package org.designpattern.creational.simplefactory;

public class PhoneFactory {
	public static Phone producePhone(String phoneType){
		if("nokia".equals(phoneType))
			return new NokiaPhone();
		else if("ericsson".equals(phoneType))
			return new EricssonPhone();
		else return null;
	}
}
