package com.ssmm.design.abstractions.first;

/**
 * 报警门 继承门 实现报警接口
 * @author HisenSong
 *
 */
public class AlarmDoor extends Door implements Alram{

	@Override
	public void alarm() {
		System.out.println("门报警了....");		
	}

	@Override
	public void open() {
		System.out.println("打开门....");		
	}

	@Override
	public void close() {
		System.out.println("关闭门....");	
	}

}
