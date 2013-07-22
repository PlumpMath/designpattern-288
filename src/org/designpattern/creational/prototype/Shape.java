package org.designpattern.creational.prototype;

public abstract class Shape implements  Cloneable {
	public abstract void info();
    public abstract Shape copyShape() throws CloneNotSupportedException;
}
