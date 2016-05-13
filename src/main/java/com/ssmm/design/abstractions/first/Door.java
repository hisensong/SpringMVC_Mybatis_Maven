package com.ssmm.design.abstractions.first;

/**
 * 门和警报的例子说明：
 * Door的open() 、close()和alarm()根本就属于两个不同范畴内的行为，
 * open()和close()属于门本身固有的行为特性，而alarm()属于延伸的附加行为
 * 
 * 1.Door设计为单独的一个抽象类，包含open和close两种行为。
 * 2.再设计一个报警门继承Door类和实现Alarm接口
 * @author HisenSong
 *
 */
public abstract class Door {
	
	public abstract void open();
	
	public abstract void close();
}
