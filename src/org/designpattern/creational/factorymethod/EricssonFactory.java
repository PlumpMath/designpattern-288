package org.designpattern.creational.factorymethod;

public class EricssonFactory implements IPhoneFactory {

	@Override
	public Phone producePhone() {
		// TODO Auto-generated method stub
		return new EricssonPhone();
	}

}
