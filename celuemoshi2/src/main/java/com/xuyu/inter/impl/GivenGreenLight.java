package com.xuyu.inter.impl;

import com.xuyu.inter.IStrategy;

public class GivenGreenLight implements IStrategy{

	public void operate() {
		System.out.println("开绿灯");
	}

}
