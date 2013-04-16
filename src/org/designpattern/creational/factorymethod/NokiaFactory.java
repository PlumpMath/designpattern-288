package org.designpattern.creational.factorymethod;

public class NokiaFactory implements IPhoneFactory {

	@Override
	public Phone producePhone() {
		// TODO Auto-generated method stub
		return new NokiaPhone();
	}

}
