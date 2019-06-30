package com.dream.obj;

public abstract class AbstCls { // 매서드중 하나라도 추상매서드가 있는 클래스는 무조건 추상클래스가 된다.
	public int sum(int a, int b) {
		return a + b;
	}

	public abstract int multi(int a, int b);
	public abstract int minus(int a, int b);

}
